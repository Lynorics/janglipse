/*
 * Copyright 2015
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.asdoc;

import java.util.ArrayList;
import java.util.List;

public class Asdoc {

	private String original;
	private String text;
	private List<Parameter> parameters = new ArrayList<Parameter>();
	private List<Metadata> metadatas;
	private List<Tag> tags = new ArrayList<Tag>();
	
	public String getOriginal() {
		return original;
	}
	
	public void setOriginal(String original) {
		this.original = original;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
}
