package week4;

public class j_71207_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
//		shows();
	}
	public void shows() {
		System.out.println("멤버");
	}

}

class AAA{

	public static void main(String[] args) {
		System.out.println("AAA");
		AAA a = new AAA();
		a.shows();
	}
	
	public void shows() {
		System.out.println("멤버");
	}
	
}

class BBB{
	public static void main(String[] args) {
		System.out.println("BBB");
		BBB b = new BBB();
		b.shows();
	}
	public void shows() {
		System.out.println("멤버");
	}
}