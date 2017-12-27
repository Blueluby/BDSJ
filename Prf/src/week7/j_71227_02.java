package week7;

public class j_71227_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시간측정");
		
		//1s = 1000ms
		// 1/1000/s  = 1ms
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			//System.out.println(i + " ");
			System.out.print(" ");
		}
		System.out.println();
		
		long end = System.currentTimeMillis();
		
		System.out.println(start + " , "+end);
		System.out.println("소요 시간 " + (end-start));
	}

}
