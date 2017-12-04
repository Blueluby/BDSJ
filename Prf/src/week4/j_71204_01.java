package week4;

import java.util.Scanner;

public class j_71204_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력된 문자열에서 특정 문자의 개수 출력
		System.out.print("문자열 입력 :");
		Scanner sc = new Scanner(System.in);
		String str = "";
		str = sc.nextLine()+1;
		System.out.print("찾고자 하는 문자는 ?:");
		char cf = ' ';
		cf = sc.next().charAt(0);
		int cnt = 0;
		for(int a = 0; a<str.length(); a++) {
			if(str.charAt(a) == cf) {
				cnt+=1;
			}
		}
		System.out.println("문자 "+cf+"의 갯수 : "+cnt);
	}
}