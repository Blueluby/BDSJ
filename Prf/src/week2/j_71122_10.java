package week2;

import java.util.*;

public class j_71122_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		a1(n);
		a2(n);
	}
	
	public static void a1(int n){
		System.out.println("\na1");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("["+i+", "+j+"]");
			}
			System.out.println();
		}
	}
	
	public static void a2(int n) {
		System.out.println("\na2");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j)
					System.out.print("["+i+", "+j+"]");
				else
					System.out.print("      ");
			}
			System.out.println();
		}
	}

}
