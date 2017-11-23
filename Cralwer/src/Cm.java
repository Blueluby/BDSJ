import java.io.*;
import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Cm {
	public static void main(String[] a) {
		Cm c = new Cm();
		c.CmRandomVisit();
		c.CmLike();
	}

	private static String sId = "";
	private static String sPw = "";
	public static String sURL = "";

	private static Document doc;
	private static Elements elem;
	private static String str;

	private static boolean bEs = false;

	public static String getsId() {
		return sId;
	}

	public static void setsId(String sId) {
		Cm.sId = sId;
	}

	public static String getsPw() {
		return sPw;
	}

	public static void setsPw(String sPw) {
		Cm.sPw = sPw;
	}

	public static String getsURL() {
		return sURL;
	}

	public static void setsURL(String sURL) {
		Cm.sURL = sURL;
	}

	public Cm() {
		setsURL("http://www.melon.com/mymusic/like/mymusiclikesong_list.htm?memberKey=");
	}

	public Cm(String sI, String sP, String sU) {
		setsId(sI);
		setsPw(sP);
		setsURL(sU);
	}

	public void CmLike() {
		ExcURL();

		try {
			doc = Jsoup.connect(sURL).get();
			elem = doc.select("span.odd_span");
			str = elem.toString();

			String sss[] = str.split("\n");
			ArrayList<String> tit = new ArrayList<String>(Arrays.asList(sss));

			String[] tril = trilString();
			
			for (int r = 0; r < 8; r++) {
				tit.removeAll(Arrays.asList(tril[r]));
			}

			if (tit.size() == 0) {
				bEs = true;
			}

			if (bEs == false) {

				for (int r = 0; r < 11; r++) {
					tit.remove(0);
				}
				for (int r = 0; r < 6; r++) {
					tit.remove(tit.size() - 1);
				}

				for (int i = 0; i < tit.size(); i++) {
					tit.set(i, tit.get(i).replaceAll("<span class=" + '"' + "odd_span" + '"' + ">", ""));
					tit.set(i, tit.get(i).replaceAll(" 상세정보 페이지 이동</span>", ""));
					System.out.println(i + 1 + ". " + tit.get(i));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Exception Core
	private void ExcId() {
		if (sId == "") {
			System.out.println("Null Data");
			return;
		}
	}

	private void ExcPW() {
		if (sPw == "") {
			System.out.println("Null Data");
			return;
		}
	}

	private void ExcURL() {
		if (sURL == "") {
			System.out.println("Null Data");
			return;
		}
	}

	private void ExcEscape() {
		System.out.println("Data NULL Escape Code");
		return;
	}

	// Tool
	private void CmRandomVisit() {
		String str = "";
		String copy = "";
		int[] rand = new int[7];
		for (int n = 0; n < 7; n++)
			rand[n] = (int) (Math.random() * 9) + 1;

		str = getsURL();

		for (int n = 0; n < 7; n++) {
			copy += rand[n] + "";
			str += rand[n] + "";
		}

		System.out.println(copy);
		setsURL(str);
		// return str;
	}

	private static String[] trilString() {
		String[] tril = new String[8];
		tril[0] = "<span class=" + '"' + "odd_span" + '"' + ">재생<" + '/' + "span>";
		tril[1] = "<span class=" + '"' + "odd_span" + '"' + ">담기<" + '/' + "span>";
		tril[2] = "<span class=" + '"' + "odd_span" + '"' + ">좋아요<" + '/' + "span>";
		tril[3] = "<span class=" + '"' + "odd_span" + '"' + ">닫기<" + '/' + "span>";
		tril[4] = "<span class=" + '"' + "odd_span" + '"' + ">뮤직비디오<" + '/' + "span>";
		tril[5] = "<span class=" + '"' + "odd_span" + '"' + ">다운로드<" + '/' + "span>";
		tril[6] = "<span class=" + '"' + "odd_span" + '"' + ">폰 다운<" + '/' + "span>";
		tril[7] = "<span class=" + '"' + "odd_span" + '"' + ">아티스트명 더보기<" + '/' + "span>";

		return tril;
	}
}
