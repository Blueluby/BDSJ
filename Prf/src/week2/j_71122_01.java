package week2;

import java.util.*;

public class j_71122_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner s = new Scanner(System.in);

		while(!(i<0)) {
			System.out.print("숫자 입력 : ");
			i = s.nextInt();
			
			switch(i/10) {
			case 0:
				System.out.println("영유아");
				break;
			case 1:
				System.out.print("10대\n");
				break;
			case 2:
				System.out.print("20대\n");
				break;
			case 3:
				System.out.print("30대\n");
				break;
			}
			if(i<0) {
				System.out.println("닝겐이 아니므니다");
				break;
			}
		}
	}
}