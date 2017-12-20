package week6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class j_71220_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두개의 정수 입력 : ");
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		try {
			n1 = sc.nextInt();
			n2 = sc.nextInt();

			// 예외가 발생될 수 있는 코딩
			System.out.println("몫 : " + (n1 / n2));
			System.out.println("나머지 : " + (n1 % n2));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("두번째 값은 0을 제외한 값을 입력");
			System.out.println(e.toString());
		} catch (InputMismatchException e) {
			// 예외에 상관없이, 무조건 실행
			System.out.println("숫자 입력이 필요한데 문자가 입력됨.");
			e.toString();
		}

	}

}
