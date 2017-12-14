package week5;

public class j_71214_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super[] ss = new Super[2];	//={new Sub(), new Sub2()};
		ss[0] = new Sub();
		ss[1] = new Sub2();
		
		ss[0].show();
		ss[1].show();
		
		//357
		//자동형변환 - 강제형변환
		//묵시적형변환 - 명시적형변환 
		
		
		Super r1 = new Sub();
		Sub b1 = (Sub)r1;
//		Sub2 b2 = (Sub2)r1;
//		System.out.println(b2.num);
		
		Super a = new Super();
//		Sub a5 = (Sub)a;
		
		//a5.show();
		
		Sub2 a6 = new Sub2();
		Super a7 = a6;
		a7.show();
		
		Sub c1 = new Sub();
		Sub2 c2 = new Sub2();
		
		method(c1);
		method(c2);
		
		/*
		if(c1 instanceof Sub) {
			System.out.println("Sub 변환 가능");
		} else if(c2 instanceof Sub2) {
			System.out.println("Sub2 변환 가능");
		}
		*/
	}
	public static void method(Super s) {
		s.show();
		System.out.println(s.num);
		
		if(s instanceof Sub) {
			System.out.println("Sub 변환 가능");
			Sub s1 = (Sub)s;
			s1.show();
			System.out.println(s1.num);
		} else if(s instanceof Sub2) {
			System.out.println("Sub2 변환 가능");
			Sub2 s2 = (Sub2)s;
			s2.show();
			System.out.println(s2.num);
		}
		
	}
}


class Super{
	int num = 10;
	int n1, n2;
	void show() {
		System.out.println("supper class");
	}
}

class Sub extends Super{
	int num = 20;
	
	void show() {
		System.out.println("sub class");
	}
}

class Sub2 extends Super{
	int num = 30;
	
	void show() {
		System.out.println("sub2 class");
	}
	void show(String str) {
		n1 = 5;
	}
}