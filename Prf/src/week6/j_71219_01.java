package week6;

public class j_71219_01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체를 생성하면서, inner class 정의(상속)
		//익명 class는 일회용, 생성자 명시 x
		Inner19 in = new Inner19() {
			void show() {
				System.out.println("오버라이딩된 show");
			}
			
			void show2() {
				System.out.println("show2");
			}
		};
		
		in.show();
	}

}

class Inner19{
	
	int n1 = 10;
	final int n2 =  20;
	
	Inner19(){
	
		System.out.println("Inner 생성자");
	}
	
	void show() {
		n1 = 1;
		System.out.println("Inner show()");
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
	}
}

