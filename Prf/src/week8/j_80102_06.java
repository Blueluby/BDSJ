package week8;

public class j_80102_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread812_06 t1 = new Thread812_06();
		Thread812_062 t2 = new Thread812_062();
		
		t2.setPriority(7);
		
		System.out.println("Priority of th1 (-) : " +t1.getPriority());
		System.out.println("Priority of th2 (-) : " +t2.getPriority());
		
		t1.start();
		t2.start();
		
	}

}

class Thread812_06 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int x = 0; x<100000; x++);;
		}
	}
}

class Thread812_062 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int x = 0; x<100000; x++);;
		}
	}
}