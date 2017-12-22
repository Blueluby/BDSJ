package week6;

public class j_71222_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stArr = new String[] {"hi", "hello", "gombangwa", "Annyang"};
		
		showArrData(stArr);
		
		
	}
	
	public static <T> void showArrData(T[] ar) {
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}