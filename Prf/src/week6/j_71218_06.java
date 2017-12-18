package week6;

public class j_71218_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_ a = new A_();
		a.methodA();
	}

}

class A_{
	void methodA() {
		I_ i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I_{
	public abstract void methodB();
}

class B_ implements I_{
	public void methodB() {
		System.out.println("method in B class");
	}
}

class InstanceManager{
	public static I_ getInstance() {
		return new B_();
	}
}