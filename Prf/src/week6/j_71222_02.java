package week6;

public class j_71222_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a = new TestA();
		TestB b = new TestB();
		
		Complete_.printClass(a);
		Complete_.printClass(b);
		
		
	}

}

class TestA{
	public String toString() {
		return "TestA class";
	}
}

class TestB{
	public String toString() {
		return "TestB class";
	}
}

class Complete{
	public void printClass() {
		System.out.println();
	}
}

class Complete_{
	public static <T> void printClass(T a) {	//제너릭 메서드
		//제너릭 타입의 매개변수는 기본적으로 Object class 의 멤버를 사용
		System.out.println(a);
		
	}
}