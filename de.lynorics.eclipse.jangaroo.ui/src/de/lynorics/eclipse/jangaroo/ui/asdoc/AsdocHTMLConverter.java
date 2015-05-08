/*
 * Copyright 2015
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.asdoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Converts from {@link Asdoc} to an HTML representation.
 *  
 * @author Lynorics
 */
public class AsdocHTMLConverter {

	@SuppressWarnings("serial")
	private Map<String, String> TRANSLATIONS = new TreeMap<String, String>() {{
		put("author", "Author");
		put("created", "Created");
		put("deprecated", "Deprecated");
		put("invariant", "Invariant");
		put("pattern", "Design Pattern");
		put("return", "Returns");
		put("see", "See Also");
		put("since", "Since");
		put("throws", "Throws");
		put("version", "Version");
	}};

	@SuppressWarnings("serial")
	private List<String> ORDER_OF_TAGS = new ArrayList<String>() {{
		add("author");
		add("version");
		add("param");
		add("return");
		add("throws");
		add("see");
		add("since");
		add("deprecated");
	}};

	/**
	 * Converts from {@link Asdoc} to an HTML string representation.
	 *  
	 * @param asdoc
	 * 
	 * @return the HTML (may be <code>null</code>)
	 */
	public String convert(Asdoc asdoc) {
		if (asdoc == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		convertText(asdoc, sb);
		convertParameters(asdoc, sb);
		convertTags(asdoc, sb);
		return sb.toString();
	}

	private void convertText(Asdoc asdoc, StringBuilder sb) {
		sb.append("<p>");
		sb.append(asdoc.getText().replaceAll("<paragraph>", "</p>\n<p>"));
		sb.append("</p>\n");
	}

	private void convertParameters(Asdoc asdoc, StringBuilder sb) {
		if (asdoc.getParameters().size() > 0) {
			sb.append("<dl>\n");
			sb.append("<dt><span class=\"strong\">");
			sb.append("Parameters:");
			sb.append("</dt>\n");
			for (Parameter parameter : asdoc.getParameters()) {
				convertParameter(sb, parameter);
			}
			sb.append("</dl>\n");
		}
	}

	private void convertParameter(StringBuilder sb, Parameter parameter) {
		sb.append("<dd>");
		sb.append("<code>");
		sb.append(parameter.getName());
		sb.append("</code>");
		sb.append(" - ");
		sb.append(parameter.getText());
		sb.append("</dd>\n");
	}

	private void convertTags(Asdoc asdoc, StringBuilder sb) {
		if (asdoc.getTags().size() > 0) {
			// first the known tags in correct order
			for(String tagName: ORDER_OF_TAGS) {
				for (Tag tag : asdoc.getTags()) {
					if (tag.getName().equals(tagName)) {
						convertTag(sb, tag);
					}
				}
			}
			// now, the unknown tags just in appearance
			for (Tag tag : asdoc.getTags()) {
				if (!ORDER_OF_TAGS.contains(tag.getName())) {
					convertTag(sb, tag);
				}
			}
		}
	}

	private void convertTag(StringBuilder sb, Tag tag) {
		sb.append("<dl>\n");
		sb.append("<dt><span class=\"strong\">");
		sb.append(translate(tag.getName()));
		sb.append("</dt>\n");
		sb.append("<dd>");
		if ("see".equals(tag.getName())) {
			sb.append(parseUrl(tag.getText()));
		}
		else {
			sb.append(tag.getText());
		}
		sb.append("</dd>\n");
		sb.append("</dl>\n");
	}

	private String parseUrl(String text) {
		StringBuilder result = new StringBuilder();
		if (text.startsWith("http://") ||
				text.startsWith("https://")) {
			String[] split = text.split(" ", 2);
			result.append("<a href=\"");
			result.append(split[0]);
			result.append("\">");
			if (split.length > 1) {
				result.append(split[1]);
			}
			else {
				result.append(split[0]);
			}
			result.append("</a>");
		}
		else {
			result.append(text);
		}
		return result.toString();
	}

	private String translate(String name) {
		if (TRANSLATIONS.containsKey(name)) {
			return TRANSLATIONS.get(name);
		}
		char first = Character.toUpperCase(name.charAt(0));
		return first + name.substring(1);
	}

}
