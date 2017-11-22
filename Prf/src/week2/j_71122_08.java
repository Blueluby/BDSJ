package week2;

import java.util.*;

public class j_71122_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;

		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = s.nextInt();
		
		for(; i<a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
