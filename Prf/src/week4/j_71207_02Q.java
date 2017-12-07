package week4;

import java.util.Arrays;
import java.util.Scanner;

public class j_71207_02Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] money = {10000,5000,1000,500,100,50,10};
		int[] count = new int[money.length];

		System.out.print("금액 입력 :");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();

		if (inp / 100000 >= 1) {
			System.out.print("용량초과, 재입력 :");
			inp = sc.nextInt();
		}
		
		for(int i = 0 ; i<money.length; i++) {
			count[i] = inp / money[i];
			inp %= money[i];
		}

		System.out.println("◈화폐 단위◈");
		for(int i=0; i<money.length; i++) {
			System.out.printf("%6d원 : %d개\n", money[i], count[i]);
		}
	}
}