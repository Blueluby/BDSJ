package week2;

public class j_71120_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int a=0;
		while(n<11) {
			a+=n++;
			//System.out.println(a+", "+n++);
			if(n!=11)
				System.out.print(a+"+");
			else if(n==11)
				System.out.print(a);
				
		}
	}

}
