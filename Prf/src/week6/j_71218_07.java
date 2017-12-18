package week6;

import week6.Outer.Inner;

public class j_71218_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.show();
		
		Outer.Inner i = o.new Inner();
		Outer.Inner i2 = o.new Inner();
		
		i.show_in();
		
		o.x = 55;
		o.show();
		i.a = 55;
		o.show();
		i.show_in();
		i2.show_in();
		
	}
}

class Outer{
	int x = 100;
	private static int y = 200;
	
	public void show() {
		System.out.println("[outer class start]");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("[outer class end]");
		
		Inner cn = new Inner();
		System.out.println("Inners member "+ cn.a);
	}
	
	public Inner Inner() {
		// TODO Auto-generated method stub
		return null;
	}

	class Inner{
		int a = 1;
		//private static int b = 2;
		
		public void show_in() {
			System.out.println("[inner class start]");
			System.out.println("x : "+x);
			System.out.println("y : "+y);
			System.out.println("a : "+a);
			System.out.println("[inner class end]");
		}
		
	}
}