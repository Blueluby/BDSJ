package week5.area;

//public class j_71213_01_02 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		_Circle c = new _Circle(1.5);
//		System.out.println("반지름이 1.5인 원의 넓이 : "+ c.getArea());
//	}
//}

/**
 * @author Circle Area Class
 */
public class j_71213_01_02{
	double rad;
	final double PI;
	
	public j_71213_01_02(double r) {
		rad = r;
		PI = 3.14;
	}
	/**
	 * <p>week5.area</p>
	 * <p>j_71213_01_02.java Circle Class</p>
	 * <p>Circle Class getArea Method()</p>
	 * @return : double
	 */
	public double getArea() {
		return (rad*rad)*PI;
	}
}
