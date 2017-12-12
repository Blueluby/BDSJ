package week5;

public class j_71212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chile c = new Chile();
		c.method();
	}

}

class Parent{
	int x = 10;
}

class Chile extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}