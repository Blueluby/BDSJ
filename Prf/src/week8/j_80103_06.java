package week8;

public class j_80103_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread8136 gc = new Thread8136();
		gc.setDaemon(true);
		gc.start();

		int requiredMemory = 0;

		for (int i = 0; i < 20; i++) {
			requiredMemory = (int) (Math.random() * 10) * 20;

			if (gc.freememory() < requiredMemory || 
				gc.freememory() < gc.totalmemory() * 0.4) {
					gc.interrupt();
					
					try {
						Thread.sleep(1000);
						gc.join();
					} catch (InterruptedException e) { }
			}

			gc.usedMemory += requiredMemory;
			System.out.println("used memory : " + gc.usedMemory);
		}
	}

}

class Thread8136 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;

	public void run() {
		while (true) {
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				System.out.println("인터럽트에 의해 일어남");
			}

			gc();
			System.out.println("가비지 콜렉팅, 프리 메모리 " + freememory());
		}
	}

	public void gc() {
		usedMemory -= 300;
		if (usedMemory < 0)
			usedMemory = 0;
	}

	public int totalmemory() {
		return MAX_MEMORY;
	}

	public int freememory() {
		return MAX_MEMORY - usedMemory;
	}

}