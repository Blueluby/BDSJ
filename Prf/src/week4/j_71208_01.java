package week4;


public class j_71208_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point();
		
		p1.show();
		
		Point p2 = new Point(1);
		p2.show();
		
		Point p3 = new Point(5,6);
		p3.show();
		
	}

}

class Point{
	int x, y;
	
	Point(){}
	Point(int a){
		x = a;
	}
	Point(int a, int b){
		x = a;
		y = b;
	}
	
	void show() {
		System.out.println("x:"+x+"y:"+y);
	}
}