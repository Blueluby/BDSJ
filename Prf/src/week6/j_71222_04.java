package week6;

public class j_71222_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_A a = new _A();
		_B b = new _B();
		_C c = new _C();
		
		
//		showInstanceAncestor(a);
	}
	
	public static <T extends UpperClass & SimpleInterface> void showInstanceAncestor(T param) {
		param.showYourName();
	}
	
	public static <T extends UpperClass> void showInstanceName(T param) {
		param.showYourAncestor();
	}
	

}

class UpperClass<T> implements SimpleInterface{
	void showYourName() {
		
		System.out.println();
	}
	
	void showYourAncestor() {
		
	}
}

interface  SimpleInterface{
	
}

class _A{
	
}

class _B{
	
}

class _C{}