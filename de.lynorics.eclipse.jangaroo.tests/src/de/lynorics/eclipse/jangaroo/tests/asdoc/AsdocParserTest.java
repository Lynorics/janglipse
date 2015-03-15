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
import de.lynorics.eclipse.jangaroo.ui.asdoc.AsdocParser;

public class AsdocParserTest {

	private final static String BASE_PATH = "src/de/lynorics/eclipse/jangaroo/tests/asdoc";

	private AsdocParser parser;

	@Before
	public void setUp() {
		parser = new AsdocParser();
	}
	
	@Test
	public void testEmptyInput() {
		Asdoc asdoc = parser.parse((String)null);
		Assert.assertNull(asdoc);
		asdoc = parser.parse((List<String>)null);
		Assert.assertNull(asdoc);
		asdoc = parser.parse(new ArrayList<String>());
		Assert.assertNull(asdoc);
	}
	
	@Test
	public void test0() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-0.txt");
		Asdoc asdoc = parser.parse(input);
		Assert.assertNotNull(asdoc);
		Assert.assertEquals(" /**\n   */",asdoc.getOriginal());
		Assert.assertEquals("", asdoc.getText());
	}
	
	@Test
	public void test1() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-1.txt");
		Asdoc asdoc = parser.parse(input);
		Assert.assertNotNull(asdoc);
		Assert.assertEquals(" /**\n\n   *  Testcase for asdoc\n\n   *  with empty lines.\n   *\n   *\n   *\n   * This results in separated paragraphs.\n   */",asdoc.getOriginal());
		System.out.println(asdoc.getText());
		Assert.assertEquals("Testcase for asdoc <paragraph> with empty lines. <paragraph> This results in separated paragraphs.", asdoc.getText());
	}
	
	@Test
	public void test2() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-2.txt");
		Asdoc asdoc = parser.parse(input);
		Assert.assertNotNull(asdoc);
		Assert.assertEquals(" /**\n   *  Testcase for asdoc with\n       irregular \n   *        lines.\n   */",asdoc.getOriginal());
		Assert.assertEquals("Testcase for asdoc with irregular lines.", asdoc.getText());
	}
	
	@Test
	public void test3() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-3.txt");
		Asdoc asdoc = parser.parse(input);
		Assert.assertNotNull(asdoc);
		Assert.assertEquals(" /**\n  *  Testcase for asdoc with parameters.\n  * @param param1 Describe param1 here.\n  * @param param2 Describe param2 here\n  *               using a multiline comment.\n  */",asdoc.getOriginal());
		Assert.assertEquals("Testcase for asdoc with parameters.", asdoc.getText());
		Assert.assertEquals(2, asdoc.getParameters().size());
		Assert.assertEquals("param1", asdoc.getParameters().get(0).getName());
		Assert.assertEquals("Describe param1 here.", asdoc.getParameters().get(0).getText());
		Assert.assertEquals("param2", asdoc.getParameters().get(1).getName());
		Assert.assertEquals("Describe param2 here using a multiline comment.", asdoc.getParameters().get(1).getText());
	}
	
	@Test
	public void test4() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-4.txt");
		Asdoc asdoc = parser.parse(input);
		Assert.assertNotNull(asdoc);
		Assert.assertEquals(" /**\n  *  Testcase for asdoc with tags.\n  * @author Lynorics\n  * @param param3 Describe param3 here.\n  * @see http://www.lynorics.de\n  */",asdoc.getOriginal());
		Assert.assertEquals("Testcase for asdoc with tags.", asdoc.getText());
		Assert.assertEquals(1, asdoc.getParameters().size());
		Assert.assertEquals("param3", asdoc.getParameters().get(0).getName());
		Assert.assertEquals("Describe param3 here.", asdoc.getParameters().get(0).getText());
		Assert.assertEquals(2, asdoc.getTags().size());
		Assert.assertEquals("author", asdoc.getTags().get(0).getName());
		Assert.assertEquals("Lynorics", asdoc.getTags().get(0).getText());
		Assert.assertEquals("see", asdoc.getTags().get(1).getName());
		Assert.assertEquals("http://www.lynorics.de", asdoc.getTags().get(1).getText());
	}
	
	@Test
	public void test5() throws IOException {
		List<String> input = readTextfile(BASE_PATH+"/asdoc-5.txt");
		Asdoc asdoc = parser.parse(input);
		Assert.assertNotNull(asdoc);
		Assert.assertEquals(" /** Testcase for asdoc as one liner. */",asdoc.getOriginal());
		Assert.assertEquals("Testcase for asdoc as one liner.", asdoc.getText());
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

}
