package week6;

// 제네릭 메소드 정의와 호출

class AAA{
	public String toString() {
		return "class AAA";
	}
}

class BBB{
	public String toString() {
		return "class BBB";
	}
}

class InstanceTypeShower{
	int showCnt = 0;
	
	public <T> void showInstType(T inst) {
		System.out.println(inst);
		showCnt++;
	}
	
	void showPrintCnt() {
		System.out.println("show count : "+showCnt);
	}
}

public class j_71222_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a = new AAA();
		BBB b = new BBB();
		
		InstanceTypeShower sw = new InstanceTypeShower();
		sw.<AAA>showInstType(a);
		sw.<BBB>showInstType(b);
	}

}
