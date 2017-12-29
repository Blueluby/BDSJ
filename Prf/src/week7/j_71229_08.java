package week7;

enum Transpotation{
	BUS(100){
		int fare(int d) {
			return d * BASIC_FARE;
		}
	},
	TRAIN(150){
		int fare(int d) {
			return d * BASIC_FARE;
		}
	},
	SHIP(100){
		int fare(int d) {
			return d * BASIC_FARE;
		}
	},
	AIRPLANE(300){
		int fare(int d) {
			return d * BASIC_FARE;
		}
	};
	
	protected final int BASIC_FARE;
	
	Transpotation(int n){
		BASIC_FARE = n;
	}

	public int getBasicFare() {
		return BASIC_FARE;
	}
	
	abstract int fare(int d);
}

public class j_71229_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BUS fare = "+Transpotation.BUS.fare(100));
		System.out.println("TRAIN fare = "+Transpotation.TRAIN.fare(100));
		System.out.println("SHIP fare = "+Transpotation.SHIP.fare(100));
		System.out.println("AIRPLANE fare = "+Transpotation.AIRPLANE.fare(100));
	}

}
