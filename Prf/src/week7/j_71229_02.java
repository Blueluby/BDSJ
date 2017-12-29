package week7;

enum Number{
	ONE, TWO, THREE
}

enum Test{
	ONE, TWO
}


public class j_71229_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Number n = new Number();	//enum 객체 생성 x
		
		System.out.println(Number.ONE);	//One
		
		Number n1 = Number.valueOf("ONE");
		System.out.println(n1);
		
//		if(Number.ONE == Test.ONE)		//자료형 안정적
//			System.out.println("같다");
		
		if(Number.ONE == Number.TWO)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		Number[] arr = Number.values();
		
		for(Number i : arr)
			System.out.println(i + "\tenum Number의 값 : "+i.ordinal());
		
		System.out.println("One의 값 : "+n1.ordinal());
		
	}
}