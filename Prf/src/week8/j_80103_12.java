package week8;

import java.awt.*;

public class j_80103_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout8132 la = new Layout8132();
	}
}

class Layout8132 extends Frame{
	
	private GridLayout gr = new GridLayout(2,2,5,5);
	private Label lb1 = new Label("1", Label.CENTER);
	private Label lb2 = new Label("2", Label.CENTER);
	private Label lb3 = new Label("3", Label.CENTER);
	private Label lb4 = new Label("4", Label.CENTER);
	
	public Layout8132() {
		// TODO Auto-generated constructor stub
		super("그리드 레이아웃");
		
		this.init();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void init() {
		this.setLayout(gr);
		
		lb1.setBackground(new Color(127, 0, 161));
		lb2.setBackground(new Color(211, 131, 120));
		lb3.setBackground(new Color(253, 80, 200));
		lb4.setBackground(new Color(80, 131, 191));
		
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
		this.add(lb4);
	}
}