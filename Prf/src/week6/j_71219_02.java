package week6;

public class j_71219_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;
		final static int CONST  = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	void method() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300;
			final static int CONST = 300;
		}
	}
}

