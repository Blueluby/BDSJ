package week4;

public class j_71207_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Num n1 = new Num();
		
		System.out.println(n1.getNum());
		
		Num n2 = new Num();
		System.out.println(n2.getNum());
		
	}

}

class Num{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public Num() {
		num = 10;
		System.out.println("생성자 호출");
	}
}