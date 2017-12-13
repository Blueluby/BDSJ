package week5;

public class j_71213_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Point p = new _Point();
		p.setX(105);
		
		p.show();
	}

}

class _Point{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x<100 && x>0)
			this.x = x;
	}

	void show() {
		System.out.println("x : "+x+", y : "+y);
	}
}