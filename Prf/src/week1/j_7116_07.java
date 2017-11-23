package week1;

import java.util.*;

public class j_7116_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		char grade = ' ';

		System.out.print("점수 입력 : ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();

		if (s > 100) {
			System.out.print("점수 입력:");
			s = sc.nextInt();
		} else if (s >= 90) {
			grade = 'A';
		} else if (s >= 80) {
			grade = 'B';
		} else if (s >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		if (s <= 100) {
			System.out.println("등급은 : " + grade + "입니다");
		} else {
			System.out.println("너에게 줄 등급은 없다 애송이 삭제해");
		}
	}
}
