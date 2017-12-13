package week5.per;

//public class j_71213_01_01 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		_Circle c = new _Circle(1.5);
//		System.out.println("반지름이 1.5인 원의 둘레 : "+c.getPerimeter());
//	}
//}

///Circle Perimeter Class
public class j_71213_01_01{
	double rad;
	final double PI;
	
	public j_71213_01_01(double r){
		rad = r;
		PI=3.14;
	}

	/**
	 * <p>week5.per</p>
	 * <p>j_71213_01_01.java Circle Class</p>
	 * <p>Circle Class getPerimeter Method()</p>
	 * @return : double
	 */
	public double getPerimeter() {
		return (rad*2)*PI;
	}
}

