package week6;

public class j_71221_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		j_71221_01.method1();
		
		System.out.println("method1 끝 후 메인 복귀");
	}
	
	static void method1() {
		try {
			System.out.println("method1 호출");
			return;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1 finally");
		}
	}

}