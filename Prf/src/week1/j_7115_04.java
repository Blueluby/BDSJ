package week1;

public class j_7115_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=0;
		boolean r;
		
		r = (n1+=10)<0 && (n2+=10)>0;
		System.out.println("r="+r);
		System.out.println("n1="+n1+", n2="+n2);
		
		r = (n1+=10)>0 || (n2+=10)>0;
		System.out.println("r="+r);
		System.out.println("n1="+n1+", n2="+n2);
	}
}