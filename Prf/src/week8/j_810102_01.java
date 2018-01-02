package week8;

public class j_810102_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread081 t1 = new Thread081();
		
		Runnable r = new Thread0812();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class Thread081	extends	Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}

class Thread0812 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
		}		
	}
	
}