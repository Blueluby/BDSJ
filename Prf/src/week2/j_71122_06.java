package week2;

public class j_71122_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dotStar();
	}
	
	public static void dotStar() {
		int i=0;
		for(; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
