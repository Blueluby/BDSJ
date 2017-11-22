package week2;

public class j_71122_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer:
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				System.out.println("["+i+", "+j+"]");
				if(i%2==0 &&j%2==0)
					break outer;
			}
		}
	}
}