package week7;

class Card_{
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOND = 2;
	static final int SPADE = 3;
	
	static final int TWO = 0;
	static final int THREE = 1;
	static final int FOUR = 2;
	
//	final int kind;
//	final int num;
}

enum Num_{
	ONE(1), TWO(2), THREE(3);
	
	int value;
	
	Num_(int n){
		value = n;
	}
	
	public int get() {
		return value;
	}
}

//enum Trump{
//	CLOVER, TWO;
//	public void show() {
//		if(CLOVER == TWO)
//			System.out.println();
//		
//	}
//}

class Card__{

	enum Kind{CLOVER, HEART, DIAMOND, SPADE}
	enum Value{TWO, THREE, FOUR}
	
	
	public void show() {
//		if(Kind.CLOVER == Value.TWO)
			System.out.println("같다");
	}
}

public class j_71229_04 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
