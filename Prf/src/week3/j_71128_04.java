package week3;

public class j_71128_04 {
	public static int adder(int n1, int n2) {
		int addr = n1 + n2;
		return addr;
	}
	public static double square(double n) {
		return n*n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = adder(4,5);
		
		System.out.println("4와 5의 합 : "+r);
		System.out.println("3.5의 제곱:"+square(3.5));
	}

}
