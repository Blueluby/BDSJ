
public class j_7114_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 10;
		double dNum = 2.2;
		
		System.out.println("in/dn = "+ iNum/(int)dNum );
		System.out.println("in/2 = "+ iNum/2);
		
		final int NUM_LAST = 10;
		
		//final이 붙은 상수는 수정이 아니됨.
		//NUM_LAST = 20;
		
		System.out.print("NUM : " +NUM_LAST);
		
	}
}