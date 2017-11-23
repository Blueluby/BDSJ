package week2;

public class j_71122_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		
		System.out.println("ī��Ʈ�ٿ�");
		
		while(i-- != 0) {
			System.out.println(i);
			//연산 많이 해서 딜레이 건다.
			for(int j=0; j<2_000_000_000L; j++) {
				;
			}
		}
	}

}
