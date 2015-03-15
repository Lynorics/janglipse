/*
 * Copyright 2015
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.asdoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsdocParser {

	public Asdoc parse(String lines) {
		if (lines == null) {
			return null;
		}
		return parse(Arrays.asList(lines.split("\n")));
	}
	
	public Asdoc parse(List<String> input) {
		if (input == null ||
				input.size() == 0) {
			return null;
		}
		Asdoc asdoc = new Asdoc();
		asdoc.setOriginal(join(input, "\n"));
		List<String> lines = trimLines(input);
		lines = parseParameters(asdoc, lines);
		lines = parseTags(asdoc, lines);
		asdoc.setText(join(lines, " ").trim());
		return asdoc;
	}

	private String join(List<String> lines, String separator) {
		StringBuilder out = new StringBuilder();
		for (Object o : lines)
		{
		  out.append(o.toString());
		  if (o != lines.get(lines.size()-1)) {
			  out.append(separator);
		  }
		}
		return out.toString();
	}

	private List<String> trimLines(List<String> input) {
		List<String> result = new ArrayList<String>();
		Boolean linefeed = null;
		boolean tagFound = false;
		for (String zeile : input) {
			zeile = zeile.trim();
			if (zeile.endsWith("*/")) {
				zeile = zeile.substring(0, zeile.length()-2);
			}
			if (zeile.startsWith("/**")) {
				zeile = zeile.substring(3);
			}
			else if (zeile.startsWith("*")) {
				zeile = zeile.substring(1);
			}
			zeile = zeile.trim();
			if (zeile.startsWith("@")) {
				tagFound = true;
			}
			else if (tagFound && "".equals(zeile)) {
				continue;
			}
			else if (!tagFound &&
					"".equals(zeile)) {
				if (linefeed == null) {
					linefeed = Boolean.TRUE;
					zeile = "<paragraph>";
				}
				else {
					linefeed = Boolean.FALSE;
				}
			}
			else {
				linefeed = null;
			}
			if ("".equals(zeile)) {
				continue;
			}
			result.add(zeile);
		}
		while (result.size() > 0 &&
				result.get(0).equals("<paragraph>")) {
			result.remove(0);
		}
		while (result.size() > 0 &&
				result.get(result.size() -1).equals("<paragraph>")) {
			result.remove(result.size() - 1);
		}
		return result;
	}

	private List<String> parseParameters(Asdoc asdoc, List<String> lines) {
		List<String> result = new ArrayList<String>();
		Parameter parameter = null;
		for (String zeile : lines) {
			if (zeile.startsWith("@param ")) {
				parameter = new Parameter();
				String[] split = zeile.substring(7).split(" ",2);
				parameter.setName(split[0]);
				if (split.length > 1) {
					parameter.setText(split[1]);
				}
				asdoc.getParameters().add(parameter);
			}
			else if (parameter != null) {
				if (!"".equals(zeile) && !zeile.startsWith("@")) {
					parameter.setText(parameter.getText()+" "+zeile);
				}
				else {
					result.add(zeile);
				}
			}
			else {
				result.add(zeile);
			}
		}
		return result;
	}

	private List<String> parseTags(Asdoc asdoc, List<String> lines) {
		List<String> result = new ArrayList<String>();
		Tag tag = null;
		for (String zeile : lines) {
			if (zeile.startsWith("@")) {
				tag = new Tag();
				String[] split = zeile.substring(1).split(" ",2);
				tag.setName(split[0]);
				if (split.length > 1) {
					tag.setText(split[1]);
				}
				asdoc.getTags().add(tag);
			}
			else if (tag != null) {
				if (!"".equals(zeile) && !zeile.startsWith("@")) {
					tag.setText(tag.getText()+" "+zeile);
				}
			}
			else {
				result.add(zeile);
			}
		}
		return result;
	}

}
