package week3;

import java.util.*;

public class j_71127_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력=");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine() + ' ';
		String strChar = "";
		int cnt=0;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				cnt++;
			else {
				strChar = strChar + str.charAt(i) + cnt ;
				cnt=1;
			}
		}
		System.out.println("결과="+strChar);
		
		
		//입력 받을 녀석을 쌓는 것
//		for(int a = 0; a<str.length()-1; a ++) {
//			if(a==0) {
//				cnt++;
//				strChar += str.charAt(a) + cnt; 
//			}
//			int ck=0;
//			while(ck<str.length()) {
//				if(str.charAt(a) == str.charAt(ck)) {
//					
//				}
//				
//				ck++;
//			}
//		}
//		System.out.println(strChar);
		
	}
}