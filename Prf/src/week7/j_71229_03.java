package week7;

enum Num{
	ONE(1), TWO(2), THREE(3);
	
	int value;
	
	Num(int n) {
		value = n;
	}
	
	public int get() {
		return value;
	}
}

public class j_71229_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Num[] n = Num.values();
		
		for(Num i : n)
			System.out.println(i+" 의 값 : "+i.get());
		
		Num nn1 = Num.THREE;
		
		switch(nn1) {		//switch문에서 enum의 상수 데이터가 사용될 때, 상수 이름만 기재해야 함. (열거형 이름.상수 이름 x)
//		case Num.ONE:		
		case ONE:
			System.out.println("ONE 입니다");
			break;
		case TWO:
			System.out.println("TWO 입니다");
			break;
		case THREE:
			System.out.println("THREE 입니다");
			break;
		}
	}

}
