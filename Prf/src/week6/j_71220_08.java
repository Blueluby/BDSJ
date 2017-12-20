package week6;

import java.util.logging.Logger;

public class j_71220_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		Logger.getLogger("aaa");
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 예외 처리");
			e.printStackTrace();
		}
	}

}
