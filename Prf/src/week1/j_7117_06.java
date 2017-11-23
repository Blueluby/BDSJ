package week1;

import java.util.*;

public class j_7117_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 4-7
		
		int user, com;
		
		System.out.print("가위(1), 바위(2), 보(3) : ");
		Scanner sc = new Scanner(System.in);
		
		user = sc.nextInt();
		com = (int)(Math.random() * 3)+1;
		
		String mzp = "";
		
		mzp = mzp(user);
		System.out.println("사용자 "+ mzp);
		mzp = mzp(com);
		System.out.println("컴퓨터"+ mzp );
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("이김 ");
			break;
		case 1: case -2:
			System.out.println("짐");
			break;
		case 0:
			System.out.println("비김");
			break;
		}
	}
	
	public static String mzp(int n) {
		String re = "";
		if(n == 1) { re = "가위"; }
		else if(n ==2) { re = "바위"; }
		else { re = "보"; }
		return re;
	}
}
