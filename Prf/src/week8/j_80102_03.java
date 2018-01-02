package week8;

public class j_80102_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++)
			System.out.print("-");
		
		System.out.print("소요시간 : "+(System.currentTimeMillis()-startTime));
		
		for(int i=0; i < 500; i++)
			System.out.print("|");
		
		System.out.print("소요시간 2 : "+(System.currentTimeMillis()-startTime));
		
	}

}
