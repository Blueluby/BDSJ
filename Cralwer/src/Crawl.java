import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//이 크롤러는 Jsoup을 사용하여 웹 페이지의 텍스트를 긁어오는 것을 목적으로 한다.
//출처 : https://fatc.club/2017/02/28/60

public class Crawl {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String URL = "https://fatc.club/2017/02/28/60";
		Document doc = Jsoup.connect(URL).get();
		Elements elem = doc.select("div.entry-inner");
		String str = elem.text();
		System.out.println(str);
	}
}