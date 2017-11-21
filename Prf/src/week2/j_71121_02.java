package week2;

public class j_71121_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		for(n=1; n<5; n++)
			System.out.println("I like java");
		int i=0, j=0;
		for(i=0, j=5; i<j; i++, j--)
			System.out.println("출력");
		
		i=0;
		for(;;) {
			i++;
			System.out.println("반복문 : "+i);
			if(i==5)
				break;
		}
	}

}
