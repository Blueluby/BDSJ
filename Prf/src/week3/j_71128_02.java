package week3;

class NumberPrinter{
	public static void showInt(int n) {
		System.out.println(n);
	}
	public static void showDouble(double n) {
		System.out.println(n);
	}
}

public class j_71128_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter.showInt(20);
		
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);
	}

}
