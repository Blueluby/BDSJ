package week2;

import java.util.*;

public class j_71122_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner s = new Scanner(System.in);

		while(!(i<0)) {
			System.out.print("���� �Է� : ");
			i = s.nextInt();
//			System.out.println(i/10+"0��");
			
			switch(i/10) {
			case 0:
				System.out.println("�Ƶ�");
				break;
			case 1:
				System.out.print("10��\n");
				break;
			case 2:
				System.out.print("20��\n");
				break;
			case 3:
				System.out.print("30��\n");
				break;
			}
			if(i<0) {
				System.out.println("����");
				break;
			}
		}
	}
}