package de.lynorics.eclipse.jangaroo.ui.contentassist;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.lynorics.eclipse.jangaroo.AS3ModelUtil;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Package;
import de.lynorics.eclipse.jangaroo.aS3.directive;

public class InsertImportCommand {

	public void apply(IDocument document, int offset, String qName) throws BadLocationException {
		IRegion line = document.getLineInformationOfOffset(offset);
		String indentation = document.get(line.getOffset(), offset - line.getOffset());
		if (indentation.trim().length() != 0) {
			indentation = "";
		}
		String importString = "import " + qName + ";\n" + indentation;
		document.replace(offset, 0, importString);
	}

	public int getImportOffset(EObject currentModel, String qName) {
		Package pack = AS3ModelUtil.findParentOfType(currentModel, Package.class);
		if (pack != null) {
			if (pack.getImp() != null) {
				for (EObject child : pack.getImp().eContents()) {
					if (child instanceof Import) {
						// ordering is lexically
						if (((Import) child).getImportedNamespace().compareTo(qName) > 0) {
							return NodeModelUtils.getNode(child).getOffset();
						}
					}
				}
			}
			return getDefaultOffset(pack);
		}
		return -1;
	}

	private int getDefaultOffset(Package container) {
		EList<directive> directives = null;
		if (container instanceof de.lynorics.eclipse.jangaroo.aS3.Package)
			directives = ((de.lynorics.eclipse.jangaroo.aS3.Package) container).getDirectives();
		if (directives != null) {
			if (!directives.isEmpty()) {
				return NodeModelUtils.getNode(directives.get(0)).getOffset();
			}
			return NodeModelUtils.getNode(container.eContents().get(0)).getOffset()+1;
		}
		return -1;
	}


}
