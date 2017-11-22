package week2;

public class j_71122_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		
		System.out.println("카운트다운");
		
		while(i-- != 0) {
			System.out.println(i);
			//많은 연산으로 딜레이 걸기 위해
			for(int j=0; j<2_000_000_000L; j++) {
				;
			}
		}
	}

}
