package week6;

class CloseableException implements AutoCloseable {
	public void createMethod() throws Exception{
		System.out.println("createMethod() 실행");
		
		throw new Exception();
		
	}
	
	public void close() {
		System.out.println("close 실행");
	}
}
public class j_71221_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 실행");
		
		CloseableException ce = null;
		
		try {
			ce = new CloseableException();
			ce.createMethod();
			
		} catch (Exception e) {
			System.out.println("예외 발생");
		}finally {
			
		}
		
	}

}
