package week7;

//1.Thread class 상속
//2.Runnable interface 상속

class Thtester extends Thread{
	public Thtester() {
		
	}
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("테스터 클래스");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thtester2 extends Thread{
	public Thtester2() {
		
	}
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("	테스터2 클래스");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class j_71229_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인시작");
		
//		Thtester th = new Thtester();
		Thread thd = new Thread(new Thtester());
		
		
		Thtester2 th2 = new Thtester2();
		
		thd.start();
		th2.start();
		
		System.out.println("메인끝");
	}

}
