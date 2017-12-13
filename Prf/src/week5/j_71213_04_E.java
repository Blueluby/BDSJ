package week5;

import week5.pro.j_71213_04_A;

public class j_71213_04_E extends j_71213_04_A {
	void show() {
//		n1 = 11;	//private	: 해당 class 내
//		n2 = 12;	//default	: 같은 package 내에서만
		n3 = 13;	//protected	: 상속, 자식 class가 접근 허용
		n4 = 14;	
	}
}
