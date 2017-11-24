package week2;

class Ex{
	int a;
	int b;
	
	void printD() {
		System.out.println(a+", "+b);
	}
}

public class j_71124_07 {

	public static void main(String[] args) {
		Ex e1 = new Ex();
		e1.a = 20;
		e1.b = 30;
		System.out.println(e1.a+", "+e1.b);
		
		Ex e2 = new Ex();
		e2.printD();
	}

}
