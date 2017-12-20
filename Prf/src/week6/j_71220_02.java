package week6;

public class j_71220_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NullTest nt = new NullTest();
		try {
		if(nt.getNullStr().equals("hi"))
			System.out.println("같다");
		} catch(NullPointerException e) {		
			System.out.println("멤버변수에 값 설정");
		}
	}

}

class NullTest{
	String nullStr;

	public String getNullStr() {
		return nullStr;
	}
}