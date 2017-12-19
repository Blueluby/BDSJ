package week6;

public class j_71219_03 {
	
	class InstanceInner1{
		int instnum = 10;
		
		void show() {
			System.out.println(StaticInner1.staticNum);
		}
	}
	static class StaticInner1{
		static int staticNum = 5;
		int staticNum2 = 10;
		
		j_71219_03 in = new j_71219_03();
		j_71219_03.InstanceInner1 in2 = in.new InstanceInner1();
		
		void show() {
			System.out.println(in2.instnum);
		}
	}
	
	InstanceInner1 iv = new InstanceInner1();
	static StaticInner1 cv = new StaticInner1();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}