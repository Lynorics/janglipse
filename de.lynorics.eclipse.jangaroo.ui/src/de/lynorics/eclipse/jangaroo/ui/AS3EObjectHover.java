package de.lynorics.eclipse.jangaroo.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.eclipse.xtext.ui.label.ILabelProviderImageDescriptorExtension;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.lynorics.eclipse.jangaroo.ui.asdoc.KeywordDocParser;
import de.lynorics.eclipse.jangaroo.ui.asdoc.KeywordDocumentation;
import de.lynorics.eclipse.jangaroo.ui.internal.AS3Activator;

public class AS3EObjectHover extends DispatchingEObjectTextHover {

  @Inject 
  IGrammarAccess grammarAccess;

  @Inject
  private ILabelProvider labelProvider;
	
	@Inject(optional = true)
	@Named("org.eclipse.xtext.ui.editor.hover.XtextEditorHover.styleSheetFileName")
	private String styleSheetFileName = "/AS3HoverStyleSheet.css"; //$NON-NLS-1$

	@Inject(optional = true)
	@Named("org.eclipse.xtext.ui.editor.hover.XtextEditorHover.font")
	private String fontSymbolicName = "org.eclipse.jdt.ui.javadocfont"; //$NON-NLS-1$ 

	private static String fgStyleSheet;

  @Override
  protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource,
      int offset) {
    Pair<EObject, IRegion> temp = null;
    ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(
      resource.getParseResult().getRootNode(), offset);
    if (node.getGrammarElement() instanceof Keyword) {
        IRegion region = new Region(node.getOffset(), node.getLength());
        temp = Tuples.create(node.getGrammarElement(), region);
    }
    else {
    	temp = super.getXtextElementAt(resource, offset);
    }
    return temp;
  }

  @Override
  public Object getHoverInfo(EObject first, ITextViewer textViewer,
      IRegion hoverRegion) {
    if (first instanceof Keyword) {
		String html = getHoverInfoForKeyword((Keyword)first);
		if (html != null) {
			StringBuffer buffer = new StringBuffer(html);
			HTMLPrinter.insertPageProlog(buffer, 0, getStyleSheet());
			HTMLPrinter.addPageEpilog(buffer);
			html = buffer.toString();
			return new XtextBrowserInformationControlInput(null, first, html, labelProvider);
		}
		return null;
    }
    else {
      return super.getHoverInfo(first, textViewer, hoverRegion);
    }
  }

	protected String getStyleSheet() {
		if (fgStyleSheet == null)
			fgStyleSheet = loadStyleSheet();
		String css = fgStyleSheet;
		if (css != null) {
			FontData fontData = JFaceResources.getFontRegistry().getFontData(fontSymbolicName)[0];
			css = HTMLPrinter.convertTopLevelFont(css, fontData);
		}
		return css;
	}

	/**
	 * Loads and returns the hover style sheet.
	 * 
	 * @return the style sheet, or <code>null</code> if unable to load
	 */
	protected String loadStyleSheet() {
		URL styleSheetURL = AS3Activator.getInstance().getBundle().getEntry(styleSheetFileName); 
		if (styleSheetURL != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(styleSheetURL.openStream()));
				StringBuffer buffer = new StringBuffer(1500);
				String line = reader.readLine();
				while (line != null) {
					buffer.append(line);
					buffer.append('\n');
					line = reader.readLine();
				}
				return buffer.toString();
			} catch (IOException ex) {
				return ""; //$NON-NLS-1$
			} finally {
				try {
					if (reader != null)
						reader.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}
  private String getHoverInfoForKeyword(final Keyword keyword) {
	  try {
		KeywordDocParser parser = new KeywordDocParser();
		KeywordDocumentation found = parser.findByMatch(keyword.getValue());
		if (found != null) {
			StringBuilder builder = new StringBuilder();
			builder.append(getImageTagLink(getImageDescriptor("icons/jooley-16x16.png")));
			builder.append("&nbsp;");
			builder.append("<b>");
			builder.append(found.getName());
			builder.append("</b><p>");
			builder.append(found.getDescription());
			builder.append("</p>");
			return builder.toString();
		}
	} catch (IOException ioe) {
		ioe.printStackTrace();
	}
    return keyword.getValue();
  }
  
	private String getImageTagLink(ImageDescriptor imageDescriptor) {
		URL url = getURL(imageDescriptor);
		if (url != null)
			return "<image src='" + url.toExternalForm() + "'/>";
		return "";
	}

	private URL getURL(ImageDescriptor descriptor) {
		if (descriptor != null) {
			return JavaPlugin.getDefault().getImagesOnFSRegistry().getImageURL(descriptor);
		}
		return null;
	}
  
	public ImageDescriptor getImageDescriptor(String imageName) {
		if (imageName != null) {
			return AS3Activator.imageDescriptorFromPlugin("de.lynorics.eclipse.jangaroo.ui", imageName);
		}
		return null;
	}
}