package week2;

public class j_71120_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 =50, n2 = 100;
		int b,d;
		
		b = (n1>n2) ? n1 : n2;
		System.out.println(b);
		
		//d = (n1>n2) ? n1-n2 : n2-n1;
		
		if(n1>n2)
			d = n1-n2;
		else 
			d=n2-n1;
		System.out.println(d);
		
	}
}