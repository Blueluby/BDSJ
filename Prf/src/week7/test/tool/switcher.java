package week7.test.tool;

import java.util.HashMap;
import java.util.Scanner;

import week7.test.algo.db;
import week7.test.concept.Academic;

public class switcher {
	
	public static int flg = 0;
	public static int cnt = 0;	//테스트 기본입력 카운팅용

	public static Scanner sc = new Scanner(System.in);
	public static HashMap<String, Academic> hsm;
	public static db adr;
	
	public switcher(HashMap hs) {
		hsm = hs;
		adr = new db(hs);
	}
	
	public static int flgCtr() {
		try {
			flg = (int)sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(flg);
		} finally {
			return flg;
		}
	}
	
	public static boolean mainCtr(int ct) {
		switch(ct) {
		case 1:
			viewer.addMenu();
			return kindCtr(flgCtr());
		case 2:
//			System.out.println("스위쳐 레벨 검색 ");
//			System.out.println(hsm.toString());
//			System.out.println();
			new db(hsm).dbSearch();
			return true;
		case 3:
			new db(hsm).dbDell();
			return true;
		case 4:
			System.exit(0);
			return true;
		default:
			return false;
		}
	}
	
	public static boolean kindCtr(int ct) {
		switch (ct) {
		case 1:
//			System.out.print("스위쳐 레벨 ");
//			hsm.put("asdf"+ cnt++, new Academic("스위쳐","폰번호","재수생",4));
//			System.out.println(hsm.toString());
			new db(hsm).dbadd();
			return true;
		case 2:
			new db(hsm).dbadd2();
			return true;
		case 3:
			new db(hsm).dbadd3();
			return true;
		default:
			return false;
		}
	}
}
