package week6;

public class j_71220_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodA();
	}

	public static void methodA() {
		System.out.println("method A");
		try {
			methodB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외 처리");
		}
	}
	
	public static void methodB() throws Exception{
		System.out.println("method B");
		try{
			throw new Exception("일부러 예외 발생");
		}catch ( Exception e ){
			System.out.println("method B 에서 에외 처리");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
