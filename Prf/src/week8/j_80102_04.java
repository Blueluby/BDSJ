package week8;

public class j_80102_04 {
	
	static long startTime = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread812_4 th1 = new Thread812_4();
		th1.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++)
			System.out.print("-");
		
		System.out.println("소요시간 1 : "+(System.currentTimeMillis() - j_80102_04.startTime));
		
	}

}

class Thread812_4 extends Thread{
	public void run() {
		for(int i=0; i< 500; i++) {
			System.out.print("|");
		}
		
		System.out.print("소요시간 2 : "+(System.currentTimeMillis()-j_80102_04.startTime));
	}
}