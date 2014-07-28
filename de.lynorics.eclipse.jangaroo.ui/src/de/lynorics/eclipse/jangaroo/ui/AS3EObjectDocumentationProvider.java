/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.impl.KeywordImpl;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.lynorics.eclipse.jangaroo.aS3.Annotation;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;

public class AS3EObjectDocumentationProvider implements IEObjectDocumentationProvider {

	protected static final String BLOCK_TAG_START = "<dl>"; //$NON-NLS-1$
	protected static final String BLOCK_TAG_END = "</dl>"; //$NON-NLS-1$
	protected static final String BlOCK_TAG_ENTRY_START = "<dd>"; //$NON-NLS-1$
	protected static final String BlOCK_TAG_ENTRY_END = "</dd>"; //$NON-NLS-1$
	protected static final String PARAM_NAME_START = "<b>"; //$NON-NLS-1$
	protected static final String PARAM_NAME_END = "</b> "; //$NON-NLS-1$
	
//	@Override
//	public String getDocumentation(EObject o) {
//
//		if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Class) {
//			de.lynorics.eclipse.jangaroo.aS3.Class myclass = (de.lynorics.eclipse.jangaroo.aS3.Class)o;
//			return buildDescription(o, findComment(o), myclass.getAnnotations());
//		}
//		else if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Interface) {
//			de.lynorics.eclipse.jangaroo.aS3.Interface myinterface = (de.lynorics.eclipse.jangaroo.aS3.Interface)o;
//			return buildDescription(o, findComment(o), myinterface.getAnnotations());
//		}
//		else if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Method) {
//			de.lynorics.eclipse.jangaroo.aS3.Method mymethod = (de.lynorics.eclipse.jangaroo.aS3.Method)o;
//			return buildDescription(o, findComment(o), mymethod.getAnnotations());
//		}
//		else if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Annotation) {
//			return buildDescription(o, findComment(o), null);
//		}
//		return null;
//	}

	@Override
	public String getDocumentation(EObject object) {
		return "";//computeDocumentation(object) + getDerivedOrOriginalDeclarationInformation(object);
	}
	/*
	private String computeDocumentation(EObject object){
		StringBuilder builder = new StringBuilder();
		fLiteralContent = 0;
		List<String> parameterNames = initParameterNames();
		Map<String,URI> exceptionNamesToURI = initExceptionNamesToURI();
		addAnnotations(object);
		getDocumentationWithPrefix(object);
		Javadoc javadoc = getJavaDoc();
		if (javadoc == null)
			return "";
		TagElement deprecatedTag = null;
		TagElement start = null;
		List<TagElement> parameters = new ArrayList<TagElement>();
		TagElement returnTag = null;
		List<TagElement> exceptions = new ArrayList<TagElement>();
		List<TagElement> versions = new ArrayList<TagElement>();
		List<TagElement> authors = new ArrayList<TagElement>();
		List<TagElement> sees = new ArrayList<TagElement>();
		List<TagElement> since = new ArrayList<TagElement>();
		List<TagElement> rest = new ArrayList<TagElement>();
		@SuppressWarnings("unchecked")
		List<TagElement> tags = javadoc.tags();
		for (Iterator<TagElement> iter = tags.iterator(); iter.hasNext();) {
			TagElement tag = iter.next();
			String tagName = tag.getTagName();
			if (tagName == null) {
				start = tag;
			} else if (TagElement.TAG_PARAM.equals(tagName)) {
				parameters.add(tag);
				@SuppressWarnings("unchecked")
				List<? extends ASTNode> fragments = tag.fragments();
				if (fragments.size() > 0) {
					Object first = fragments.get(0);
					if (first instanceof SimpleName) {
						String name = ((SimpleName) first).getIdentifier();
						int paramIndex = parameterNames.indexOf(name);
						if (paramIndex != -1) {
							parameterNames.set(paramIndex, null);
						}
					}
				}
			} else if (TagElement.TAG_RETURN.equals(tagName)) {
				if (returnTag == null)
					returnTag = tag; // the Javadoc tool only shows the first return tag
			} else if (TagElement.TAG_EXCEPTION.equals(tagName) || TagElement.TAG_THROWS.equals(tagName)) {
				exceptions.add(tag);
				@SuppressWarnings("unchecked")
				List<? extends ASTNode> fragments= tag.fragments();
				if (fragments.size() > 0) {
					Object first= fragments.get(0);
					if (first instanceof Name) {
						String name= ASTNodes.getSimpleNameIdentifier((Name) first);
						if (exceptionNamesToURI.containsKey(name) ) {
							exceptionNamesToURI.put(name,null);
						}
					}
				}
			} else if (TagElement.TAG_SINCE.equals(tagName)) {
				since.add(tag);
			} else if (TagElement.TAG_VERSION.equals(tagName)) {
				versions.add(tag);
			} else if (TagElement.TAG_AUTHOR.equals(tagName)) {
				authors.add(tag);
			} else if (TagElement.TAG_SEE.equals(tagName)) {
				sees.add(tag);
			} else if (TagElement.TAG_DEPRECATED.equals(tagName)) {
				if (deprecatedTag == null)
					deprecatedTag = tag; // the Javadoc tool only shows the first deprecated tag
			} else {
				rest.add(tag);
			}
		}

		boolean hasParameters = parameters.size() > 0;
		boolean hasReturnTag = returnTag != null;
		boolean hasExceptions = exceptions.size() > 0;
		if (deprecatedTag != null)
			handleDeprecatedTag(deprecatedTag);
		if (start != null) {
			@SuppressWarnings("unchecked")
			List<ASTNode> fragments = start.fragments();
			handleContentElements(fragments);
		}

		if (hasParameters || hasReturnTag || hasExceptions || versions.size() > 0 || authors.size() > 0
				|| since.size() > 0 || sees.size() > 0 || rest.size() > 0 || (builder.length() > 0)
				&& (parameterNames.size() > 0 || exceptionNamesToURI.size() > 0)) {
			handleSuperMethodReferences(object);
			builder.append(BLOCK_TAG_START);
			handleParameters(object, parameters,parameterNames);
			handleReturnTag(returnTag);
			handleExceptionTags(exceptions, exceptionNamesToURI);
			handleBlockTags("Since:", since);
			handleBlockTags("Version:", versions);
			handleBlockTags("Author:", authors);
			handleBlockTags("See Also:", sees);
			handleBlockTags(rest);
			builder.append(BLOCK_TAG_END);
		} else if (buffer.length() > 0) {
			handleSuperMethodReferences(object);
		}
		String result = builder.toString();
		return result;
	}
	
	private String getDerivedOrOriginalDeclarationInformation(EObject object){
		String derivedInformation = getDerivedElementInformation(object);
		if(derivedInformation != null && derivedInformation.length() > 0) {
			return getDerivedElementInformation(object);
		}
		return getOriginalDeclarationInformation(object);
	}
	
	protected String getDerivedElementInformation(EObject o) {
		StringBuffer buf = new StringBuffer();
		List<EObject> jvmElements = getFilteredDerivedElements(o, TypesPackage.Literals.JVM_MEMBER);
		if(jvmElements.size() > 0) {
			buf.append("<dt>Derived element:</dt>");

			for(EObject jvmElement : jvmElements){
					buf.append("<dd>");
					buf.append(computeLinkToElement(jvmElement));	
					buf.append("</dd>");
			}
		}
		return buf.toString();
	}
	
	protected String getOriginalDeclarationInformation(EObject o){
		StringBuffer buf = new StringBuffer();
		List<EObject> sourceElements = getFilteredSourceElements(o, null);
		if(sourceElements.size() > 0){
			buf.append("<dt>Original declaration:</dt>");
			for(EObject sourceElement: sourceElements){
				buf.append("<dd>");
				buf.append(computeLinkToElement(sourceElement));	
				buf.append("</dd>");
			} 
		}
		return buf.toString();
	}
	
	protected List<EObject> getFilteredDerivedElements(EObject o, final EClass type) {
		List<EObject> jvmElements = Lists.newArrayList(Iterables.filter(associations.getJvmElements(o), new Predicate<EObject>() {
			public boolean apply(EObject input) {
				if(input instanceof JvmConstructor && ((JvmConstructor) input).getParameters().size() == 0)
					return false;
				if(type == null)
					return true;
				return EcoreUtil2.isAssignableFrom(type, input.eClass());
			}
		}));
		return jvmElements;
	}

	protected List<EObject> getFilteredSourceElements(EObject o, final EClass type){
		List<EObject> sourceElements = Lists.newArrayList(Iterables.filter(associations.getSourceElements(o), new Predicate<EObject>() {
			public boolean apply(EObject input) {
				if(type == null)
					return true;
				return EcoreUtil2.isAssignableFrom(type, input.eClass());
			}
		}));
		return sourceElements;
	}
	
	private String computeLinkToElement(EObject jvmElement) {
		String imageURL = hoverSignatureProvider.getImageTag(jvmElement);
		String signature = hoverSignatureProvider.getDerivedOrSourceSignature(jvmElement);
		return imageURL + createLinkWithLabel(XtextElementLinks.XTEXTDOC_SCHEME, EcoreUtil.getURI(jvmElement), signature);
	}
	
	private StringBuilder addAnnotations(StringBuilder builder, EObject object, EList<Annotation> annotations) {
			for (Annotation annotation : annotations) {
				builder.append("[");
				builder.append(HoverLinkHelper.createLinkWithLabel(XtextElementLinks.XTEXTDOC_SCHEME, EcoreUtil.getURI(annotation),
						annotation.getName()));
				if (annotation.getAnnonFields() != null &&
					annotation.getAnnonFields().getAnnonFields() != null &&
					annotation.getAnnonFields().getAnnonFields().size() > 0) {
					builder.append("(");
					for (annotationField field : annotation.getAnnonFields().getAnnonFields()) {
						builder.append(field.getName());
					}
					builder.append(")");
				}
				builder.append("]");
				builder.append("<br>");
			}
			return builder;
	}

	private String buildDescription(EObject o, String comment, EList<Annotation> annotations) {
		StringBuilder builder = new StringBuilder();
		if (annotations != null) {
			builder = addAnnotations(builder, o, annotations);
		}
		if (comment != null) {
			builder.append(comment);
		}
		return builder.toString();
	}

	protected String getDocumentationWithPrefix(EObject object) {
		String returnValue = null;
		ICompositeNode node = NodeModelUtils.getNode(o);
		if (node != null) {
			for (INode abstractNode : node.getAsTreeIterable()) {
				if (abstractNode instanceof ILeafNode && !((ILeafNode) abstractNode).isHidden() && !(abstractNode.getGrammarElement() instanceof Keyword) && !(abstractNode.getGrammarElement() instanceof RuleCall))
					break;
				if (abstractNode instanceof ILeafNode && abstractNode.getGrammarElement() instanceof TerminalRule
						&& "ML_COMMENT".equalsIgnoreCase(((TerminalRule) abstractNode.getGrammarElement()).getName())) {
					String comment = ((ILeafNode) abstractNode).getText();
					if (comment.matches("(?s)" + "/\\*\\*?" + ".*")) {
						returnValue = comment;
					}
				}
			}
		}
		return returnValue;
	}

	
	protected void getDocumentationWithPrefixOld(EObject object) {
		String startTag = "/**";
		String endTag = "*"++"/";
		ILineSeparatorInformation lineSeparatorInformation = whitespaceInformationProvider.getLineSeparatorInformation(EcoreUtil.getURI(object));
		String lineBreak = lineSeparatorInformation.getLineSeparator();
		String documentation = documentationProvider.getDocumentation(object);
		if (documentation == null) {
			DocumentationAdapter adapter = (DocumentationAdapter) EcoreUtil.getAdapter(object.eAdapters(),
					DocumentationAdapter.class);
			if (adapter != null)
				documentation = adapter.getDocumentation();
			EObject primarySourceElement = associations.getPrimarySourceElement(object);
			if (primarySourceElement != null)
				documentation = documentationProvider.getDocumentation(primarySourceElement);
		}

		if (documentation != null && documentation.length() > 0) {
			BufferedReader reader = new BufferedReader(new StringReader(documentation));
			StringBuilder builder = new StringBuilder(startTag + lineBreak);
			try {
				String line = "";
				while ((line = reader.readLine()) != null) {
					if (line.length() > 0)
						builder.append(line + lineBreak);
				}
				builder.append(endTag);
			} catch (IOException e) {

			}
			rawJavaDoc = builder.toString();
		}
	}
	*/
}