package week8;

import javax.swing.JOptionPane;

public class j_80103_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread8134 th1 = new Thread8134();
		th1.start();
		
		String inp = JOptionPane.showInputDialog("아무값 입력 ");
		System.out.println("입력한 값 - "+inp+ " 임");
		th1.interrupt();
		System.out.println("isInterrupted() : "+th1.isInterrupted());
	}

}

class Thread8134 extends Thread{
	public void run() {
		int i = 10;
		while( i != 0 && !isInterrupted()) {
			System.out.println(i--);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("예외 발생");
			}
//			for(long x = 0; x<25000000L; x++);
		}
		System.out.println("카운트 종료");
	}
}