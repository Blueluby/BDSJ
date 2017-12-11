package week5;

public class j_71211_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A a = new A();
//		System.out.println(a.varA);
//		B b = new B();
//		System.out.println(b.varB);
		C c = new C();
		System.out.println(c.varC);
//		System.out.println(c.b.varB);
		
		System.out.println(c.varA);
	}

}

class A{
	int varA = 1;
}

class B extends A{
	int varB = 2;
}

class C extends B{
//	B b = new B();
	int varC = 3;
}