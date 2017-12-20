package week6;

public class j_71220_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("분모가 0");
			}
		}
	}

}
