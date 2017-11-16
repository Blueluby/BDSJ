package week1;

import java.util.*;

public class j_7116_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		char grade = ' ';

		System.out.print("점수 : ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();

		if (s > 100) {
			System.out.print("입력 오류 재입력:");
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
			System.out.println("학점 " + grade + "임.");
		} else {
			System.out.println("너에게 줄 점수는 없다 거짓말쟁이야");
		}
	}
}
