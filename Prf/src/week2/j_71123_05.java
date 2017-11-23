package week2;

import java.util.*;

public class j_71123_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("헤이, 츄라이 츄라이 (1~3). exit(0)");

			m = sc.nextInt();
			
			if(m==0) {
				System.out.print("EXIT");
				break;
			} else if( !(1<=m && m<=3)){
				System.out.println("메뉴 잘못 선택, 종료는 0");
				continue;
			}
			
			System.out.println("선택 메뉴 :" +m+"임.");
		}
	}
}