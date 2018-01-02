package week8;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Point;

public class j_80102_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Frame812_8 f1 = new Frame812_8(200, 200);
		
//		System.out.println("포함 여부 : "+f1.contains(300,100));
//		System.out.println("색상 : "+f1.getBackground());
//		System.out.println("크기 정보 : "+f1.getBounds());
//		System.out.println("위치 : "+f1.getLocation());
		
//		Frame812_8 f2 = new Frame812_8(500, 600);
		
		Frame812_8 f3 = new Frame812_8();
		
		
//		for(int i = 0; i<10; i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) { }
//			if(i%2 == 0 )
//				f1.requestFocus();
//			else
//				f2.requestFocus();
//		}
		
		
	}
}

class Frame812_8 extends Frame{
	
	public Frame812_8() {
		this.setVisible(true);
		this.setSize(300, 400);
		this.setBackground(Color.red);
		this.setBounds(700, 200, 250, 250);
		this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
//		this.setEnabled(false);

		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		this.setLocation(400, 500);
		this.setSize(300, 300);
	}
	
	public Frame812_8(int x, int y) {
		setVisible(true);
		setSize(300, 400);
		setLocation(x, y);
	}
	
	@Override
	public void addNotify() {
		// TODO Auto-generated method stub
		System.out.println("프레임 보임?");
		super.addNotify();
	}
}