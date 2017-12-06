package week4;

public class j_71206_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));
	}
	
	static long factorial(int n) {
		long result = 0;
		
		if(n==1) return 1;
		
		return n*factorial(n-1);
	}

}
