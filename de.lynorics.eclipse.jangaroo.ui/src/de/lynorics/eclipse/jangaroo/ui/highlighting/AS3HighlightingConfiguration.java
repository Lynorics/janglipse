/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class AS3HighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String ASDOC_ID      = "ASDOC";
	public static final String ANNOTATION_ID = "Annotation";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ASDOC_ID, "ASDoc", asdocTextStyle());
		acceptor.acceptDefaultHighlighting(ANNOTATION_ID, "Annotations", annotationTextStyle());
	}

	public TextStyle asdocTextStyle() {
		TextStyle textStyle = commentTextStyle().copy();
		textStyle.setColor(new RGB(63,95,191));
		return textStyle;
	}

	public TextStyle annotationTextStyle() {
		TextStyle textStyle = commentTextStyle().copy();
		textStyle.setColor(new RGB(100,100,100));
		return textStyle;
	}
	
} 