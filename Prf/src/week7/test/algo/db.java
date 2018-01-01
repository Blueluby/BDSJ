package week7.test.algo;

import java.util.HashMap;
import java.util.Scanner;

import week7.test.concept.*;

public class db {
	
	private static HashMap hs;
	private static Scanner sc;
	
	private static DefaultProfil def;
	private static Academic adc;
	private static Employee empe;
	
	public db(HashMap hsm) {
		hs = new HashMap();
		hs = hsm;
		sc = new Scanner(System.in);

		def = new DefaultProfil();
		adc = new Academic();
		empe = new Employee();
	}
	
	public static String sScan() {
		String str = sc.nextLine();
		return str;
	}
	
	public static boolean inspection(String s) {
		if(hs.get(s) != null)
			return false;
		else
			return true;
	}
	
	public static void dbadd() {
		System.out.print("이름 : ");
		def.setName(sScan());
		if(inspection(def.getName())) {
			System.out.print("전화번호 : ");
			def.setPhone(sScan());
			hs.put(def.getName(), def);
			System.out.println("데이터 입력이 완료되었습니다.");
		}else {
			System.out.println("이미 저장된 데이터입니다.");
		}
	}
	
	public static void dbadd2() {
		System.out.print("이름 : ");
		adc.setName(sScan());
		if(inspection(adc.getName())) {
			System.out.print("전화번호 : ");
			adc.setPhone(sScan());
			System.out.print("전공 : ");
			adc.setProf(sScan());
			System.out.print("학년 : ");
			try {
				int a = Integer.parseInt(sScan()) == 0 ? 1 : 1;
				adc.setGrade(a);
			}catch (Exception e) {
				System.out.println(adc.getGrade());
			}finally {
				hs.put(adc.getName(), adc);
				System.out.println("데이터 입력이 완료되었습니다.");
			}
		}else {
			System.out.println("이미 저장된 데이터입니다.");
		}
	}
	
	public static void dbadd3() {
		System.out.print("이름 : ");
		empe.setName(sScan());
		if(inspection(empe.getName())) {
			System.out.print("전화번호 : ");
			empe.setPhone(sScan());
			System.out.print("전공 : ");
			try {
				empe.setNcompany(sScan());
			}catch (Exception e) {
				System.out.print("");
			}finally {
				hs.put(empe.getName(), empe);
				System.out.println("데이터 입력이 완료되었습니다.");
			}
		}else {
			System.out.println("이미 저장된 데이터입니다.");
		}
	}
	
	public static void dbSearch() {
		System.out.println("데이터 검색을 시작합니다..");
		System.out.print("선택 : ");
		String key = sScan();
		if(inspection(key)) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}else {
			System.out.println(hs.get(key).toString());
		}
	}
	
	public static void dbDell() {
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름 : ");
		hs.remove(sScan());
		System.out.println("데이터 삭제가 완료되었습니다.");
	}
}
