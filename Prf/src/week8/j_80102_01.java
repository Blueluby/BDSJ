package week8;

public class j_80102_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("메인시작");
		
		Thread081 t1 = new Thread081();
		
//		Runnable r = new Thread0812();
//		Thread t2 = new Thread(r);
		Thread t2 = new Thread(new Thread0812());
		
		t1.start();
		
		t1 = new Thread081();
		t1.start();
		
		t2.start();
		
		System.out.println("메인끝");
	}
}

class Thread081	extends	Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName());
		}
	}
}

class Thread0812 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}		
	}
	
}