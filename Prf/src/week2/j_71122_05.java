package week2;

public class j_71122_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forw();
				
		rev();
	}
	
	public static void forw() {
		System.out.println("[for]");
		int cnt = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j)
					System.out.print(cnt);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

	public static void rev() {
		System.out.println("\n[rev]");
		int c = 1, cnt = 2;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(cnt==j)
					System.out.print(c);
				else	
					System.out.print(0);
			}
			cnt--;
			System.out.println();
		}
	}
}
