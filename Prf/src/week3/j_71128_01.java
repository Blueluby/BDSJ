package week3;

class AccessWay{
	int num = 0;
	public void incrCnt() {
		num++;
	}
}

public class j_71128_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessWay ac = new AccessWay();
		ac.num++;
		System.out.println("num = "+ac.num);
	}

}
