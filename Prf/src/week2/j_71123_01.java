package week2;

import java.util.*;

public class j_71123_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, sum = 0;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();

		while(true) {
			sum += i%10;
			i /=10;
			if(i==0)
				break;
		}
		System.out.println("합은 : " + sum);
	}
}
