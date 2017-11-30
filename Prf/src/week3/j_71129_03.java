package week3;

import java.util.Scanner;

public class j_71129_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr();

		int[] math;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();

		math = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print("[" + math[i] + "]");
		}
	}

	public static void arr() {
		int[] math = new int[5];

		for (int i = 0; i < math.length; i++) {
			System.out.println("math[" + i + "]:" + math[i]);

		}
	}
}
