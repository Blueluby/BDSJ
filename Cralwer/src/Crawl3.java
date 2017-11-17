import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Crawl3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String str = getTList();
		String str;
		str = getTList();
		//String sss[] = str.split("\n");
		System.out.println("Str : "+str);
		
		System.out.println("\n¡æ∑·");
	}

	public static String getTList() throws Exception{
		String URL = "http://www.todayhumor.co.kr/board/list.php?table=mabinogi";
		Document doc = Jsoup.connect(URL).get();
		Elements elem = doc.select("table");
		
		String str = elem.toString();
		
		return str;
	}
}
