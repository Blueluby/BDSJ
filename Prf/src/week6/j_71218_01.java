package week6;

import java.util.Scanner;

interface Week{
	int MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6, SUN = 7;
}

public class j_71218_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("오늘의 요일은?");
		System.out.print("1. 월, 2. 화, 3. 수, 4. 목, 5. 금, 6. 토, 7. 일");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		switch(i) {
		case Week.MON:
			System.out.println("주간회의");
			break;
		case Week.TUE:
			System.out.println("프로젝트 기획 회의");
			break;
		case Week.WED:
			System.out.println("진행사항 보고");
			break;
		case Week.THU:
			System.out.println("사내 축구시합");
			break;
		case Week.FRI:
			System.out.println("프로젝트 마감");
			break;
		case Week.SAT:
			System.out.println("집");
			break;
		case Week.SUN:
			System.out.println("휴식");
			break;
		}
	}

}
