package week5;

public class j_71214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		__Car car = new __Car();
		__Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}