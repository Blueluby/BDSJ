package week1;

import java.util.*;

public class j_7117_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender=' ';
		String regNo = "";
		
		System.out.print("주민등록번호 입력  (001122-1111222) :");
		
		Scanner sc = new Scanner(System.in);
		regNo = sc.nextLine();
		
		
		gender = regNo.charAt(7);
		switch(gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("입력오류");
		}
		
		String aa = regNo.charAt(7)+"";
		switch(aa) {
		case "1": case "3":
			System.out.println("남자");
			break;
		case "2": case "4":
			System.out.println("여자");
			break;
		default:
			System.out.println("입력오류");
		}
		
	}
}