package week2;

public class j_71124_04 {

	public static void increment(int n) {
		n++;
		System.out.println("1증가   - "+n);
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static float sum(float a, float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 2;
		System.out.println(c);
		
		increment(c);
		System.out.println(c);
		
		c = sum(c,2);
		System.out.println(c);
		
		System.out.println(sum(2.34f,1.22f));
	}

}
