package week2;

public class j_71121_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int c = 0;
		
		while(n++<10) {
			if( n%2!=0 || n%3!=0)
				continue;
			
			c++;
			System.out.println(n);
		}
		System.out.println("c : " + c );
	}
}