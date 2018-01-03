package week8;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Rectangle;

public class j_80103_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Label8138 l = new Label8138();
	}

}

class Label8138 extends Frame{
	
	private Label la = new Label("연습중");
	private Label la1 = new Label("dd");
	
	private Font fo = new Font("굴림체", Font.ITALIC, 30);
	
	public Label8138() {
		super("레이블 연습");
		this.init();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public void init() {
		
		setLayout(null);
		setBackground(Color.ORANGE);
		
		la.setBounds(50,50,80,70);
		la.setBackground(Color.MAGENTA);
		la.setFont(fo);
				
		add(la);
		
		
	}
	
}