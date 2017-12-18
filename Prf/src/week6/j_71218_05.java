package week6;

public class j_71218_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method(new B());
	}

}

class A{
	public void method(B b) {
		b.methodB();
	}
}

class B{
	public void methodB() {
		System.out.println("methodB");
	}
}

