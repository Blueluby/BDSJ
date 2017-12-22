package week6;

public class j_71221_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();	//1
				//6
		} catch (Exception e) {	//7
			System.out.println("main에서 예외 처리");
		}
	}

	static void method1() throws Exception{	//2
		try {
			throw new Exception();	//3
		} catch (Exception e) {	//4
			// TODO: handle exception
			System.out.println("method1 예외 처리");
			throw e;	//5
		}
	}
}
