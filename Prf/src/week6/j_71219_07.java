package week6;

import java.util.Scanner;

public class j_71219_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("두개의 정수 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			//예외가 발생될 수 있는 코딩
			System.out.println("몫 : "+(n1/n2));
			System.out.println("나머지 : "+(n1%n2));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("두번째 값은 0을 제외한 값을 입력");
			System.out.println(e.toString());
		} catch (RuntimeException r) {
			// TODO: handle exception
		} catch (Exception e) {
			//예외에 상관없이, 무조건 실행
		} catch (Throwable t) {
			// TODO: handle exception
		} finally {
			
		}
	}

}
