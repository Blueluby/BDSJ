package week4;

public class j_71207_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number n1 = new Number();
		n1.setNum(10);
		
		System.out.println(n1.num);
		
		Number n2 = new Number(20);
		n2.showNum();
		
		Number n3 = new Number(5,10);
		n3.showNumA();
	}

}

class Number{
	int num, numB;

	public Number() {}	
	public Number(int n) {
		num = n;
	}
	public Number(int n, int m) {
		num = n;
		numB = m;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void showNum() {
		System.out.println("num : "+num);
	}
	public void showNumA() {
		System.out.println("num : "+num+", numb :"+numB);
	}
}