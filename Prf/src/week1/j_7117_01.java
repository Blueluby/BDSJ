package week1;

import java.util.*;

public class j_7117_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int g = 0;
		String s = new  String();
		
		System.out.print("점수 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		g = sc.nextInt();		
		
		while( g > 100 || g < 0 ) {
			System.out.print("범위가 이상합니다 재입력하세요 ( 0~100 ): ");
			g = sc.nextInt();
		}
		
		if( g >= 90 ) {
			s += "A";
			if( g >= 98) {	s += "+"; }
			else if( g < 94 ) { s += "-"; }
		} else if(g >= 80) {
			s += "B";
			if( g >= 88) { s += "+"; }
			else if( g < 84 ) { s += "-"; }
		} else if(g >= 70) {
			s += "C";
			if( g >= 78) { s += "+"; }
			else if(g < 74) { s += "-"; }
		} else { s += "F"; }
		
		System.out.println("당신의 학점은 : " + s);
	}
}