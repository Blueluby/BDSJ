import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

//�� ũ�ѷ��� Jsoup�� ����Ͽ� �� �������� �ؽ�Ʈ�� �ܾ���� ���� �������� �Ѵ�.
//��ó : https://fatc.club/2017/02/28/60

public class Crawl {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String str = getTList();
		
		String sss[] = str.split("\n");
		ArrayList<String> tit = new ArrayList<String>(Arrays.asList(sss));
		
//		HashSet hs = new HashSet(tit);
//		ArrayList<String> nar = new ArrayList<String>(hs);

		String[] tril = trilString();
		
		for(int r=0; r<8; r++) {
			tit.removeAll(Arrays.asList(tril[r]));
		}

		for(int r=0;r<11;r++) {
			tit.remove(0);
		}
		for(int r=0; r<6; r++) {
			tit.remove(tit.size()-1);
		}
		
		for(int i=0; i<tit.size(); i++) {
			tit.set(i, tit.get(i).replaceAll("<span class="+'"'+"odd_span"+'"'+">",""));
			tit.set(i, tit.get(i).replaceAll(" ������ ������ �̵�</span>",""));
			System.out.println(i+1 + ". "+ tit.get(i));
		}
	}
	
	public static String getTList() throws Exception{

//		String URL = "https://fatc.club/2017/02/28/60";
		String URL = "http://www.melon.com/mymusic/like/mymusiclikesong_list.htm?memberKey=4265575";
		Document doc = Jsoup.connect(URL).get();
//		System.out.println(doc.toString());
//		Elements elem = doc.select("div.article");
		Elements elem = doc.select("span.odd_span");
		
		String str = elem.toString();
		
		return str;
	}
	
	public static String[] trilString() {
		String[] tril = new String[8];
		tril[0] = "<span class="+'"'+"odd_span"+'"'+">���<"+'/'+"span>";
		tril[1]="<span class="+'"'+"odd_span"+'"'+">���<"+'/'+"span>";
		tril[2]="<span class="+'"'+"odd_span"+'"'+">���ƿ�<"+'/'+"span>";
		tril[3]="<span class="+'"'+"odd_span"+'"'+">�ݱ�<"+'/'+"span>";
		tril[4]="<span class="+'"'+"odd_span"+'"'+">��������<"+'/'+"span>";
		tril[5]="<span class="+'"'+"odd_span"+'"'+">�ٿ�ε�<"+'/'+"span>";
		tril[6]="<span class="+'"'+"odd_span"+'"'+">�� �ٿ�<"+'/'+"span>";
		tril[7]="<span class="+'"'+"odd_span"+'"'+">��Ƽ��Ʈ�� ������<"+'/'+"span>";
		
		return tril;
	}
}