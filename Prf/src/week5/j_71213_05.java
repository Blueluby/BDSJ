package week5;

public class j_71213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card("Heart", 10);
		System.out.println(c.KIND);
		System.out.println(c.toString());
		
	}

}

class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}