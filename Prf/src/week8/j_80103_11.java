package week8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class j_80103_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout8131 l1 = new Layout8131();
	}

}

class Layout8131 extends Frame{
	
	private BorderLayout bl = new BorderLayout();
	
	private Label lb1 = new Label("중앙", Label.CENTER);
	private Label lb2 = new Label("동", Label.CENTER);
	private Label lb3 = new Label("서", Label.CENTER);
	private Label lb4 = new Label("남", Label.CENTER);
	private Label lb5 = new Label("북", Label.CENTER);
	
	public Layout8131() {
		super("보더 레이아웃");
		
		this.init();
		
		this.setSize(300, 200);
		this.setVisible(true);
		
	}
	
	public void init() {
		
		this.setLayout(bl);
		
		lb1.setBackground(Color.YELLOW);
		lb2.setBackground(Color.BLUE);
		lb3.setBackground(Color.white);
		lb4.setBackground(Color.red);
		lb5.setBackground(Color.black);
		
		
		this.add("Center", lb1);
		this.add("East", lb2);
		this.add("West", lb3);
		this.add("South", lb4);
		this.add("North", lb5);
	}
}