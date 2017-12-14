package week5;

public class j_71214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		__Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine)car;
		fe2.water();
		
	}

}

class __Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("운전운전");
	}
	void stop() {
		System.out.println("멈춤멈춤");
	}
}

class FireEngine extends __Car{
	void water() {
		System.out.println("불잡아라");
	}
}