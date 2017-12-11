package week5;

public class j_71211_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int AB[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int d = -1;
		for(int x = 0; x<AB.length; x++) {
			for(int y=0; y<AB.length; y++) {
				
				System.out.print("["+AB[x][y]+"]");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		for(int x = 0; x<AB.length; x++) {
			for(int y=0; y<AB.length; y++) {
				System.out.print("["+AB[y][x]+"]");
			}
			System.out.println();
		}
	}
}