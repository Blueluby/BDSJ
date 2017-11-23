package week2;

import java.util.*;

public class j_71123_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int a = 0;
		
		a = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 UpDown Game");
		do {
			i = sc.nextInt();
			
			if(i>a) {
				System.out.println("[Down]");
			}else if(i<a) {
				System.out.println("[Up]");
			}
		}while(i != a);
		
		System.out.println("끝");
	}
}