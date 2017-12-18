package week6;

import org.xml.sax.helpers.ParserAdapter;

interface Parseable{
	public abstract void parse(String fileName);
}

class ParserManager{
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed");
	}
}

public class j_71218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
