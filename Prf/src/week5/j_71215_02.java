package week5;

public class j_71215_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Parent p = new _Parent();
		_Child c = new _Child();
		
		System.out.println("p.x="+p.x);
		p.method();
		
		System.out.println("c.x="+c.x);
		c.method();
	}

}

class _Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class _Child extends _Parent{
	int x = 200;
	
	void method() {
		System.out.println("child");
	}
}