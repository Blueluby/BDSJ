package week6;

class Outer2{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class LocalInner{
			int iv=400;
		}
	}
	void myMethod2() {
		class LocalInner{
			int iv=400;
		}
	}
}
public class j_71219_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv - "+ii.iv);
		System.out.println("outer.staticinner.cv - "+Outer2.StaticInner.cv);
		
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv - "+si.iv);
		
	}

}
