package week2;

import java.util.*;

public class j_71124_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gi = 0;
		Scanner sc = new Scanner(System.in);
		gi = sc.nextInt();

		for (int i = 1; i < gi; i++) {
			for(int j = 1; j<gi; j++) {
				if((i+j)==gi) {
					System.out.println(i + "+" + (gi - i) + "=" + gi);
				}
			}
		}
	}
}