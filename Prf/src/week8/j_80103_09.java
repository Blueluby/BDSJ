package week8;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class j_80103_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dimension8139 d = new Dimension8139();
		Dimension di = d.getSize();
		
		System.out.println(di.getWidth());
		System.out.println(di.getHeight());
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension di2 = tk.getScreenSize();
		System.out.println(di2.getHeight());
		System.out.println(di2.getWidth());
		
		
	}

}

//Dimension : 높이, 폭을 관리

class Dimension8139 extends Frame{
	public Dimension8139() {
		super("Dimension");
		this.setSize(300, 200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di3 = tk.getScreenSize();
		this.setLocation((int)(di3.getWidth()/2)-this.getWidth()/2,
						 (int)(di3.getHeight()/2)-this.getHeight()/2);
		
		this.setVisible(true);
	}
}