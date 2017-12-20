package week6;

import java.util.Scanner;

public class j_71220_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("나이  ");
		
		int age = 0;
		
		try {
			age = readAge();
			System.out.println("나이는 "+age+" 입니다");
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

	public static int readAge() throws AgeInputException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 0) {
			throw new AgeInputException();
		}
		return age;
	}
}

class AgeInputException extends Exception{
	
	public AgeInputException() {
		super("유효하지 않은 나이가 입력되었음\n");
	}
	
}