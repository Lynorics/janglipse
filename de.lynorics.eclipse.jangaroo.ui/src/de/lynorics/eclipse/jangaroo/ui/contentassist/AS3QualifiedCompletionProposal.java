package de.lynorics.eclipse.jangaroo.ui.contentassist;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;

import de.lynorics.eclipse.jangaroo.AS3ModelUtil;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Package;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.scoping.AS3ImportedNamespaceScopeProvider;

/**
 * @author mb0
 */
public class AS3QualifiedCompletionProposal extends
		ConfigurableCompletionProposal {
	
	protected String quali;
	protected final EObject currentModel;
	private AS3ImportedNamespaceScopeProvider importedNamespaceScopeProvider;

	public AS3QualifiedCompletionProposal(String proposal, AS3ImportedNamespaceScopeProvider importedNamespaceScopeProvider,
			EObject currentModel, int replacementOffset, int replacementLength,
			int length, Image image, StyledString displayString) {
		super(proposal, replacementOffset, replacementLength, length, image,
				displayString, null, null);
		this.importedNamespaceScopeProvider = importedNamespaceScopeProvider;
		this.currentModel = currentModel;
	}
	@Override
	public void selected(ITextViewer viewer, boolean smartToggle) {
		super.selected(viewer, smartToggle);
	}
	public void checkImports() {
		String replacementString = getReplacementString();
		QualifiedName qname = QualifiedName.create(replacementString.split("\\."));
		for (ImportNormalizer norm:getImportNormalizers(currentModel)) {
			QualifiedName name = norm.deresolve(qname);
			if (name != null && name.getSegmentCount() == 1) {
				setReplacementString(name.toString());
				return;
			}
		}
		quali = qname.skipLast(1).toString();
		String newReplacement = qname.getLastSegment();
		setReplacementString(newReplacement);
		setCursorPosition(getCursorPosition()-quali.length()-1);
	}
	protected List<ImportNormalizer> getImportNormalizers(EObject context) {
		if (importedNamespaceScopeProvider != null) {
			EObject current = context;
			while (current != null) {
				if (importedNamespaceScopeProvider.hasImports(current)) break;
				current = current.eContainer();
			}
			return importedNamespaceScopeProvider.getImportResolvers(context, false);
		}
		return Collections.emptyList();
	}

	@Override
	public void apply(IDocument document) {
		checkImports();
		if (quali != null) {
			try {
				InsertImportCommand command = new InsertImportCommand();
				int importOffset = command.getImportOffset(currentModel, quali);
				if (importOffset != -1) {
					command.apply(document, importOffset, quali + "." + getReplacementString());
					return;
				}
			} catch (BadLocationException x) {
				// ignore
			}
		}
		super.apply(document);
	}
}