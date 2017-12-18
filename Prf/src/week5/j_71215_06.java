package week5;

public class j_71215_06 {
	public static void main(String[] args) {
		Ex e = new SubEx();

		System.out.println(e.a);
		e.show();
		e.printAB();
		
		Ex[] ea = {new SubEx(), new SubEx1()};
		((SubEx)ea[0]).printAB();
		((SubEx1)ea[1]).printAB();
		
		ea[0].printAB();
		ea[1].printAB();
	}
}

abstract class Ex{
	int a = 5;
	
	abstract void printAB();
	
	public void show() {
		System.out.println("멤버 "+a);
	}
}

class SubEx extends Ex{

	@Override
	void printAB() {
		// TODO Auto-generated method stub
		System.out.println("SubEx의 오버라이딩된 printAB");
	}
	
	public void show() {
		System.out.println("자식거");
	}
}

class SubEx1 extends Ex{

	@Override
	void printAB() {
		// TODO Auto-generated method stub
		System.out.println("Subex2의 printAB");
	}
	
}