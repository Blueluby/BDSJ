package week6;

public class j_71218_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer__ o = new Outer__();
		o.show();
		
		
	}

}

class Outer__{
	int x = 100;
	private static int y = 200;
	
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
		class Inner__{
			int a = 1;
			int b = 2;
			
			void show_in() {
				System.out.println("inner show in");
				System.out.println("a : "+a);
			}
			
		}
		
		Inner__ i = new Inner__();
		i.show_in();
	}
}