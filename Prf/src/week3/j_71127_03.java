package week3;

class Number{
	int n=0;
	public Number(){
		n=0;
	}
	public void addNum(int an) {
		n+=an;
	}
	public int getNumber() {
		return n;
	}
}

public class j_71127_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number nIn = new Number();
		System.out.println("전 : "+nIn.getNumber());
		
		foo(nIn);
		System.out.println("후 : "+nIn.getNumber());
	}
	
	public static void foo(Number nn) {
		nn.addNum(12);
	}
}
