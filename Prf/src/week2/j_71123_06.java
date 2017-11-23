package week2;

public class j_71123_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1:
			for(int i=2; i<10; i++) {
				for(int j=2; j<10; j++) {
					if(j==5)
						break Loop1;
					
					System.out.println(i+"x"+j+"="+i*j);
				}
				System.out.println();
			}
	}
}