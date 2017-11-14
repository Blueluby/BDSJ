import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//�� ũ�ѷ��� Jsoup�� ����Ͽ� �� �������� �ؽ�Ʈ�� �ܾ���� ���� �������� �Ѵ�.
//��ó : https://fatc.club/2017/02/28/60

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