package week2;

public class j_71122_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if(i==0)
				System.out.print("[구구단]\t");
			else
				System.out.print("["+i+"단]\t");
			
			for (int k = 1; k <= 9; k++) {
				if(i==0)
					System.out.print("["+k+"단]\t");
				else
					System.out.print(i + "x" + k + "=" + i * k + "\t");
			}
			System.out.println("");
		}
	}

}
