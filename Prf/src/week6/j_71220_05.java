package week6;

import java.io.IOException;
import java.util.Scanner;

public class j_71220_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("문자를 입력  ");
		
		char ch = 0;
		char[] chs = new char[5];
		Scanner sc = new Scanner(System.in);
		try {
//			ch = (char)System.in.read();
//			System.out.println("입력된 문자 : "+ch);
			
			for(int i=0;i<chs.length; i++) {
				chs[i] = (char)System.in.read();
				
			}
		} catch (IOException e) {
			System.out.println("exception");
			
			e.printStackTrace();
		}
		System.out.println(chs);
		System.out.println("끝.");
	}
}