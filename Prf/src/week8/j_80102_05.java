package week8;

import javax.swing.JOptionPane;

public class j_80102_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread812_05 t1 = new Thread812_05();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하쇼");
		System.out.println("입력값은  "+input +"입니다");
		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
	}

}

class Thread812_05 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}