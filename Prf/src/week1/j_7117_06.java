package week1;

import java.util.*;

public class j_7117_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 4-7
		
		int user, com;
		
		System.out.print("����(1), ����(2), ��(3) : ");
		Scanner sc = new Scanner(System.in);
		
		user = sc.nextInt();
		com = (int)(Math.random() * 3)+1;
		
		String mzp = "";
		
		mzp = mzp(user);
		System.out.println("����� "+ mzp);
		mzp = mzp(com);
		System.out.println("���� "+ mzp );
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("�й� ");
			break;
		case 1: case -2:
			System.out.println("�¸�");
			break;
		case 0:
			System.out.println("���");
			break;
		}
	}
	
	public static String mzp(int n) {
		String re = "";
		if(n == 1) { re = "����"; }
		else if(n ==2) { re = "����"; }
		else { re = "��"; }
		return re;
	}
}
