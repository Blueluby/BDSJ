package week2;

import java.util.*;

public class j_71122_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner s = new Scanner(System.in);

		while(!(i<0)) {
			System.out.print("나이 입력 : ");
			i = s.nextInt();
//			System.out.println(i/10+"0대");
			
			switch(i/10) {
			case 0:
				System.out.println("아동");
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
				System.out.println("종료");
				break;
			}
		}
	}
}