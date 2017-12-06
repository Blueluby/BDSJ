package week4;

import java.util.Arrays;
import java.util.Scanner;

public class j_71206_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] geti = new int[5];
		for (int i = 0; i < geti.length; i++) {
			System.out.print("수" + i + " = ");
			geti[i] = sc.nextInt();
		}
		for (int i = 0; i < geti.length - 1; i++)
			for (int j = 0; j < geti.length - 1 - i; j++)
				if (geti[j] < geti[j + 1]) {
					int tmp = geti[j];
					geti[j] = geti[j + 1];
					geti[j + 1] = tmp;
				}

		System.out.println("정렬 순서 :" + Arrays.toString(geti));
	}
}