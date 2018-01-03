package week8;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;

public class j_80103_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button8133 btn = new Button8133();
	}

}

class Button8133 extends Frame{
	
	private Button[] btns = new Button[13];
	
//	private Button btn1 = new Button("1");
//	private Button btn2 = new Button("2");
//	private Button btn3 = new Button("3");
//	private Button btn4 = new Button("4");
//	private Button btn5 = new Button("5");
//	private Button btn6 = new Button("6");
//	private Button btn7 = new Button("7");
//	private Button btn8 = new Button("8");
//	private Button btn9 = new Button("9");
//	private Button btn10 = new Button("*");
//	private Button btn11 = new Button("0");
//	private Button btn12 = new Button("#");
	
	public Button8133(){
		super("버튼");
	
		this.init();
		this.setSize(300, 400);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension dw = this.getSize();
		
		this.setLocation((int)(di.getWidth()/2-dw.getWidth()/2),
						 (int)(di.getHeight()/2-dw.getHeight()/2));
		
		this.setVisible(true);
	}
	
	public void init() {
		this.setLayout(new GridLayout(4, 3));
		for(int i=1; i<13; i++) {
			String st = i+"";
			if(i==10)	st = "*";
			else if(i==11) st = "0";
			else if(i==12) st = "#";
			
			btns[i] = new Button(st);
			this.add(btns[i]);
		}
		
//		this.add(btn1);
//		this.add(btn2);
//		this.add(btn3);
//		this.add(btn4);
//		this.add(btn5);
//		this.add(btn6);
//		this.add(btn7);
//		this.add(btn8);
//		this.add(btn9);
//		this.add(btn10);
//		this.add(btn11);
//		this.add(btn12);
	}
}