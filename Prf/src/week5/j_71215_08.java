package week5;

interface _A1{
	//멤버변수 : public static final -> 변수를 상수화, interface 명으로 멤버 접근 // 같은 프로젝트 내 접근 가능
	int w = 10;
	static int x = 20;
	final int y = 30;
	static int z = 40;
}

interface _A2{
	//메서드 : 추상 메서드
	public abstract void show();
	default void printA() {
	}
}

interface _A3{
	//추상 메서드
}

class _A4 implements _A2{
	public void show() {}
	public void printA() {}
}

class _A5{
	void test() {
		
	}
}

public class j_71215_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		_A1.x = 200;
//		_A1.z = 300;
		
		System.out.println(_A1.x);
		System.out.println(_A1.z);
		System.out.println(_A1.w);
		
		
		
	}
}