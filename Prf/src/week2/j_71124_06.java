package week2;

public class j_71124_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,2);
		divide(6,0);
	}
	
	public static void divide(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("NO");
			return;
		}
		System.out.println("=> "+n1/n2);
			
	}

}
