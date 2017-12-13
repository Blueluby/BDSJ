package week5.cal;

public class j_71213_06_01{
	private Adder adder;
	private Subtractor subtractor;
	
	public j_71213_06_01() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int n1, int n2) {
		return adder.addTwoNumber(n1,n2);
	}
	public int subTwonumber(int n1, int n2) {
		return subtractor.subTwoNumber(n1,n2);
	}
	
	public void showOperatingTimes() {
		System.out.println("덧셈 횟수 : "+adder.getCntAdd());
		System.out.println("뺄셈 횟수 : "+subtractor.getCntSub());
	}
}

class Adder{
	private int cntAdd;
	
	Adder(){
		cntAdd = 0;
	}
	int getCntAdd() {
		return cntAdd;
	}
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1+n2;
	}
}

class Subtractor{
	private int cntSub;
	
	Subtractor() {
		cntSub = 0;
	}
	int getCntSub() {
		return cntSub;
	}
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
}