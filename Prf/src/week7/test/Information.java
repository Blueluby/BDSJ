package week7.test;

import java.util.HashMap;
import java.util.Scanner;

import week7.test.concept.Academic;
import week7.test.tool.switcher;
import week7.test.tool.viewer;

public class Information {
	
	private static switcher swc;
	
	public static void main(String[] args) {
		
		HashMap<String, Academic> db = new HashMap<String, Academic>();
		
		swc = new switcher(db);
		Scanner sc = new Scanner(System.in);
		
		int flg = 0;
		while(true) {
			try {
//				System.out.println("인포메이션 레벨 "+db.toString());
				new viewer().mainMenu();
				flg = (int)sc.nextInt();
				swc.mainCtr(flg);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(flg);
			}
		}
	}
}