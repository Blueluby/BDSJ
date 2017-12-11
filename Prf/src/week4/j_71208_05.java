package week4;

public class j_71208_05 {

	static {
		System.out.println("클래스 초기화 블록 실행 : static { }");
	}
	{
		System.out.println("인스턴스 초기화 블록 실행 : { }");
	}
	
	public j_71208_05() {
		System.out.println("생성자 실행");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 함수 내 출력 : BlockTest bt = new BlockTest();");
		j_71208_05 bt = new j_71208_05();
		
		System.out.println("메인 함수 내 출력 : BlockTest bt1 = new BlockTest();");
		j_71208_05 bt1 = new j_71208_05();
		
	}

}

class BlockTest{
	static {
		System.out.println("클래스 초기화 블록 실행 : static { }");
	}
	{
		System.out.println("인스턴스 초기화 블록 실행 : { }");
	}
	
	public BlockTest() {
		System.out.println("생성자 실행");
	}
	
}