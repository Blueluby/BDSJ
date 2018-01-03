package week8;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class j_80103_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout8130 la = new Layout8130();
		
		
		
	}
}


class Layout8130 extends Frame{

	private FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 20);
	private Label la1 = new Label("첫번째");
	private Label la2 = new Label("두번째", Label.CENTER);
	private Label la3 = new Label("첫번째", Label.CENTER);
	
	
	public Layout8130() {
		super("레이아웃");
		
		this.init();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void init() {
		
		this.setLayout(fl);
		
		la1.setBackground(Color.blue);
		la2.setBackground(Color.green);
		la3.setBackground(Color.PINK);
		
		this.add(la1);
		this.add(la2);
		this.add(la3);
		
		
		
	}
}