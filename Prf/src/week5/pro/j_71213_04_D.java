package week5.pro;

public class j_71213_04_D extends j_71213_04_A {
	void set() {
//		n1 = 11;	// Error!  private 	: class 내.
		n2 = 12;	// default 			: 같은 package 내
		n3 = 13;	// protected		: 상속 허용
		n4 = 14;	// public			: 어디서나
	}
}
