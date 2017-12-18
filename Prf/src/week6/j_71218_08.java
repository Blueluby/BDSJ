package week6;

public class j_71218_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_.Inner_ i = new Outer_.Inner_();
		i.show_in();
		
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(Outer_.Inner_.b);		//static은 직접접근이 더 낫다.
		
		
	}

}

class Outer_{
	int x = 100;
	static int y = 200;
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	static class Inner_{
		int a = 1;							//non static
		static int b = 2;			//static 멤버
		
		public void show_in() {
			System.out.println("a : "+a);
			System.out.println("b : "+b);
//			System.out.println("x : "+x);
			System.out.println("y : "+y);
		}
		
	}
}