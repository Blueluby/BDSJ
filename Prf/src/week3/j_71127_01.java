package week3;

import java.util.*;

public class j_71127_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력=");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strChar = "";
		int cnt=0;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				cnt++;
			else
				strChar = strChar + str.charAt(i) + cnt ;
		}
		System.out.println(strChar);
	}
}