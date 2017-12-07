package week4;

public class j_71207_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show(3,5);
		
		show(3,4,5,6,7);
		
	}
	
	public static void show(int a) {
		System.out.println("a : " + a);
	}
	
	public static void show(int a, int b, int... num) {
		System.out.print("a:"+a+", b:"+b);
		for(int i=0; i<num.length; i++) {
			System.out.print(", "+num[i]);
		}
		System.out.println();
	}
}
