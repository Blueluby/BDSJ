package week7;

import java.util.ArrayList;

public class j_71229_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child__ c = new child__();
		
		c.depreMethod();
		
		System.out.println("c.num : "+c.num);
		
		Run r = new Run() {
			public void runMethod() {
				System.out.println("어노니머스");
			}
		};
		
		r.runMethod();
		//람다식 표현
		
		Run r2 = ()->System.out.println("람다식 표현");
		
		r2.runMethod();
		
		
		
		@SuppressWarnings("unchecked")
		ArrayList<child__> list = new ArrayList();
		list.add(new child__());
		
	}

}

class Parent__{
	void parentMethod() {}
	
}

class child__ extends Parent__{
	
	@Override
	void parentMethod() {
		
	}
	
	@Deprecated
	int num = 10;
	
	@Deprecated
	void depreMethod() {
		System.out.println("depreMethod() 실행 됨");
	}
}

@FunctionalInterface	//함수형 인터페이스, 그리고 포함하는 추상메서드는 하나만 존재 해야 함.
interface Run{
	public abstract void runMethod();
//	void twoMethod();
}
