package week1;

import java.util.*;

public class j_7117_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender=' ';
		String regNo = "";
		
		System.out.print("�ֹι�ȣ? (001122-1111222) :");
		
		Scanner sc = new Scanner(System.in);
		regNo = sc.nextLine();
		
		
		gender = regNo.charAt(7);
		switch(gender) {
		case '1': case '3':
			System.out.println("����");
			break;
		case '2': case '4':
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��Ȱ�");
		}
		
		String aa = regNo.charAt(7)+"";
		switch(aa) {
		case "1": case "3":
			System.out.println("����");
			break;
		case "2": case "4":
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��Ȱ�");
		}
		
	}
}