package week4;

import java.io.IOException;
import java.util.Scanner;

public class j_71206_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//강사 버전
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		int cnt = 0;
		char ch = 0;
		
		System.out.print("문자열 입력 :");
		str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 :");
		ch = (char)System.in.read();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch)
				cnt++;
		}
		
		if(cnt == 0)
			System.out.println("찾는 문자 없음");
		else
			System.out.println("문자 "+ch + "의 개수 :"+cnt);	
	}
}