package week3;
class InstCnt{
	static int n = 0;
	public void count() {
		n++;
		System.out.println("인스턴스 생성"+n);
	}
	
	int n2 = 5;
	
	public void show() {
		n2++;
	}
}
public class j_71128_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstCnt cnt1 = new InstCnt();
		cnt1.count();
		InstCnt cnt2 = new InstCnt();
		cnt2.count();
		InstCnt cnt3 = new InstCnt();
		cnt3.count();
		
	}

}
