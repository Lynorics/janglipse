/*
 * Copyright 2015
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.tests.asdoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.lynorics.eclipse.jangaroo.ui.asdoc.Asdoc;
import de.lynorics.eclipse.jangaroo.ui.asdoc.AsdocHTMLConverter;
import de.lynorics.eclipse.jangaroo.ui.asdoc.AsdocParser;

public class AsdocHTMLConverterTest {

	private final static String BASE_PATH = "src/de/lynorics/eclipse/jangaroo/tests/asdoc";
	
	private AsdocParser parser;
	private AsdocHTMLConverter converter;

	@Before
	public void setUp() {
		parser = new AsdocParser();
		converter = new AsdocHTMLConverter();
	}
	
	@Test
	public void testEmptyInput() {
		String html = converter.convert(null);
		Assert.assertNull(html);
	}
	
	@Test
	public void test0() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-0.txt");
		Asdoc asdoc = parser.parse(input);
		String html = converter.convert(asdoc);
		Assert.assertNotNull(html);
		Assert.assertEquals("<p></p>\n", html);
	}
	
	@Test
	public void test1() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-1.txt");
		Asdoc asdoc = parser.parse(input);
		String html = converter.convert(asdoc);
		Assert.assertNotNull(html);
		System.out.println(html);
		String expected = join(readTextfile(BASE_PATH+"/asdoc-1.html"),"\n");
		Assert.assertEquals(expected, html);
	}
	
	@Test
	public void test2() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-2.txt");
		Asdoc asdoc = parser.parse(input);
		String html = converter.convert(asdoc);
		Assert.assertNotNull(html);
		Assert.assertEquals("<p>Testcase for asdoc with irregular lines.</p>\n", html);
	}
	
	@Test
	public void test3() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-3.txt");
		Asdoc asdoc = parser.parse(input);
		String html = converter.convert(asdoc);
		Assert.assertNotNull(html);
		String expected = join(readTextfile(BASE_PATH+"/asdoc-3.html"),"\n");
		Assert.assertEquals(expected, html);
	}
	
	@Test
	public void test4() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-4.txt");
		Asdoc asdoc = parser.parse(input);
		String html = converter.convert(asdoc);
		Assert.assertNotNull(html);
		String expected = join(readTextfile(BASE_PATH+"/asdoc-4.html"),"\n");
		Assert.assertEquals(expected, html);
	}
	
	@Test
	public void test5() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-5.txt");
		Asdoc asdoc = parser.parse(input);
		String html = converter.convert(asdoc);
		Assert.assertNotNull(html);
		Assert.assertEquals("<p>Testcase for asdoc as one liner.</p>\n", html);
	}
	
	private List<String> readTextfile(String filename) throws IOException {
		BufferedReader br = null;
		List<String> liste = new ArrayList<String>();
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(filename));
			while ((sCurrentLine = br.readLine()) != null) {
				liste.add(sCurrentLine);
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
		return liste;
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
}
