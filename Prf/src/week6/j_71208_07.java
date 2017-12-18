package week6;

public class j_71208_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_ c = new Child_();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticmethod();
	}
}

class Child_ extends Parent_ implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in child");
	}
}

class Parent_{
	public void method2() {
		System.out.println("method2() in parent");
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in myinterface");
	}
	default void method2() {
		System.out.println("method2() in myinterface");
	}
	
	static void staticMethod() {
		System.out.println("static method() in myinteface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in myinterface2");
	}
	static void staticmethod() {
		System.out.println("static method() in myinterface");
	}
}