package week4;

public class j_71208_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		
		System.out.println(num);
		
		Init in = new Init();
		in.show();
		
	}

}

class Init{
	int num1 = 1;	//instance 변수
	int num2 = 2;
	static int num3 = 3;//class 변수, static변수, 정적 변수
	
	static{
		//static 초기화 블록, 위 static선언된 변수 값을 변경 가능
		System.out.println("static 초기화 블록");
		num3 = 200;
	}
	
	{
		//instance 초기화 블록
		System.out.println("Instance 초기화 블록");
	}
	
	Init(){
		System.out.println("num1 "+num1+", num2 "+num2);
		num1 = 3;
		num2 = 4;
	}
	void show() {
		System.out.println("num1 "+num1+", num2 "+num2+" num3 "+num3);
	}
}