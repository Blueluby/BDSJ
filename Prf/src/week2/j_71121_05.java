package week2;

public class j_71121_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		boolean search=false;
		
		while(n<100) {
			if(n%5==0 && n%7==0) {
				search = true;
				break;
			}
			n++;
		}
		
		if(search)
			System.out.println("최소공배수:"+n);
		else
			System.out.println("x");
	}
}