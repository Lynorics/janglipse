/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.lynorics.eclipse.jangaroo.ui.asdoc.AsdocHTMLConverter;
import de.lynorics.eclipse.jangaroo.ui.asdoc.AsdocParser;

public class AS3EObjectDocumentationProvider implements IEObjectDocumentationProvider {

	protected static final String BLOCK_TAG_START = "<dl>"; //$NON-NLS-1$
	protected static final String BLOCK_TAG_END = "</dl>"; //$NON-NLS-1$
	protected static final String BlOCK_TAG_ENTRY_START = "<dd>"; //$NON-NLS-1$
	protected static final String BlOCK_TAG_ENTRY_END = "</dd>"; //$NON-NLS-1$
	protected static final String PARAM_NAME_START = "<b>"; //$NON-NLS-1$
	protected static final String PARAM_NAME_END = "</b> "; //$NON-NLS-1$
	
	private final static String START_TAG = "/\\*\\*?";
	private final static String RULE_NAME = "ASDOC";

	@Override
	public String getDocumentation(EObject o) {
		return new AsdocHTMLConverter().convert(new AsdocParser().parse(findComment(o)));
	}

	protected String findComment(EObject o) {
		String returnValue = null;
		List<INode> documentationNodes = getDocumentationNodes(o);
		if (!documentationNodes.isEmpty()) {
			return documentationNodes.get(0).getText();
		}
		return returnValue;
	}
	
	/**
	 * Returns the nearest multi line comment node that precedes the given object. 
	 * @return a list with exactly one node or an empty list if the object is undocumented.
	 */
	public List<INode> getDocumentationNodes(EObject object) {
		ICompositeNode node = NodeModelUtils.getNode(object);
		List<INode> result = Collections.emptyList();
		if (node != null) {
			// get the last multi line comment before a non hidden leaf node
			for (ILeafNode leafNode : node.getLeafNodes()) {
				if (!leafNode.isHidden())
					break;
				if (leafNode.getGrammarElement() instanceof TerminalRule
						&& RULE_NAME.equalsIgnoreCase(((TerminalRule) leafNode.getGrammarElement()).getName())) {
					String comment = leafNode.getText();
					if (comment.matches("(?s)" + START_TAG + ".*")) {
						result = Collections.<INode>singletonList(leafNode);
					}
				}
			}
		}
		return result;
	}
}