import java.io.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Cm {
	private static String sId = "";
	private static String sPw = "";
	public static String sURL = "";
	
	private static Document doc;
	private static Elements elem;
	private static String str; 
	
	
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

	public Cm() throws IOException {
		CmInit();	
	}
	
	public Cm(String sI, String sP, String sU) {
		setsId(sI);
		setsPw(sP);
		setsURL(sU);
	}
	
	public void CmInit(){
		try {
			doc = Jsoup.connect(sURL).get();
			elem = doc.select("span.odd_span");
			str = elem.toString();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
