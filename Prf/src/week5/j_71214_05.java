package week5;

public class j_71214_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		__Car c = new __Car();
		
		if(fe instanceof FireEngine) {
			System.out.println("this tis a FireEngine");
		}
		
		if(fe instanceof __Car) {
			System.out.println("this is a Car Instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("this is an Object instance");
		}
		
		System.out.println(fe.getClass().getName());
	}

}
