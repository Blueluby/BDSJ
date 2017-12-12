package week5;

public class j_71212_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3d p = new Point3d(1,2,3);
		System.out.println(p.getLocation());
	}

}

class _Point_{
	int x;
	int y;
	
	_Point_(){}
	_Point_(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : "+ x +", y : "+y;
	}
}

class Point3d extends _Point_{
	int z;
	
	Point3d(){}
	Point3d(int x, int y, int z){
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+ x + ", y : "+ y + ", z : "+z;
	}
}