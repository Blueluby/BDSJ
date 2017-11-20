package week2;

public class j_71120_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(true) {
			i++;
			System.out.println(i);
			if(i==5) 
				break;
		}
		
		do {
			System.out.println("do:"+i);
			i++;
		}while(i<10);
	}
}