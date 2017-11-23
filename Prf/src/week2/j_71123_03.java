package week2;

import java.util.*;

public class j_71123_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, s=0;
		boolean f = true;
		String sta = "";
		System.out.println("합계를 구할 숫자 입력");
		Scanner sc = new Scanner(System.in);
		while(f) {
			n = sc.nextInt();
			s += n;
			sta+= n+"\n";
			if(n==0)
				f = false;
		}
		System.out.println("[연산]\n"+sta+"총합 : " + s);
	}
}