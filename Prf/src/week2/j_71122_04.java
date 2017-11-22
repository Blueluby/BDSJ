package week2;

public class j_71122_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,j=2;
		for (i = 2; i < 10; i++) {
			if (i % 2 == 0 && j % 2 == 00) {
				for (j = 2; j < 10; j++) {
					System.out.print(i + "x" + j + "=" + i * j + "\t");
					if (i == j) {
						break;
					}
				}
				System.out.println();
			}
		}
	}
}