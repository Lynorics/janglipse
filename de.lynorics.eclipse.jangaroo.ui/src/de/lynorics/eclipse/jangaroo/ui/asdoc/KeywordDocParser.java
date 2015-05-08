package de.lynorics.eclipse.jangaroo.ui.asdoc;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class KeywordDocParser {
	private static List<KeywordDocumentation> list = null;

	public KeywordDocParser() throws IOException {
		if (list == null) {
			Document doc = null;
			try {
				String url = "statements.html";
				doc = Jsoup.parse(new File(url), "UTF-8");
			}
			catch (IOException ioe) {
//				System.out.println("Parsing ActionScript3 Statements from Adobe...");
//				String url = "http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/statements.html";
//				doc = Jsoup.parse(new URL(url), 800);
			}
			if (doc != null) {
				list = parse(doc);
			}
			else {
				list = new ArrayList<KeywordDocumentation>();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		KeywordDocParser parser = new KeywordDocParser();
		KeywordDocumentation match = parser.findByMatch("doc");
		System.out.println(match.getName());
		System.out.println(match.getDescription());
	}

	private List<KeywordDocumentation> parse(Document doc) {
		List<KeywordDocumentation> list = new ArrayList<KeywordDocumentation>();
		Elements tables = doc.select("table.detailHeader");
		if (tables.size() > 0) {
			for (Element table : tables) {
				KeywordDocumentation keyword = new KeywordDocumentation();
				Elements header = table.select("td.detailHeaderName");
				keyword.setName(header.get(0).text());
				keyword.setDescription(table.nextSibling().outerHtml());
				list.add(keyword);
			}
		}
		return list;
	}

	public KeywordDocumentation findByMatch(String match) {
		KeywordDocumentation result = null;
		for (KeywordDocumentation keyword : list) {
			if (keyword.isSuitable(match)) {
				result = keyword;
			}
		}
		return result;
	}
}