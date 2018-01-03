package week8;

public class j_80103_02 implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new j_80103_02());
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {}
			
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장됨");
	}
}
