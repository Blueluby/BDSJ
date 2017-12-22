package week6;

class TestOne <T>{
	T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}
}

//class TestTwo{
//	double num;
//
//	public double getNum() {
//		return num;
//	}
//
//	public void setNum(double num) {
//		this.num = num;
//	}
//	
//}

public class j_71221_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne t1 = new TestOne();
		t1.setNum(10);
		System.out.println("num : "+t1.getNum());
		t1.setNum(2.3);
		System.out.println("num : "+t1.getNum());
		
		
//		TestTwo t2 = new TestTwo();
//		t2.setNum(2.3);
//		System.out.println("num : "+t2.getNum());
		
		Integer[] arr = new Integer[4];
		int[] arr2 = new int[5];
		
		int n1 = 5;
		Integer n2 = new Integer(5);
		int n3 = n2;	
		
		
	}

}
