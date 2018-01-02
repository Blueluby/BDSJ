package week8;

public class j_80102_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx812 t1 = new ThreadEx812();
		t1.start();
	}

}

class ThreadEx812 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
