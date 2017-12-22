package week6;

public class j_71221_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox f1 = new  FruitBox();
		f1.store(new Orange(10));
		Orange or = (Orange)f1.pullOut();
		or.showSugarContent();
		
		FruitBox f2 = new FruitBox();
		f2.store("얼륀쥐");
		Orange o2 = (Orange)f2.pullOut();
		o2.showSugarContent();
		
	}

}

class Orange{
	int sugarContent;
	public Orange(int sugar) {
		sugarContent = sugar;
	}
	public void showSugarContent() {
		System.out.println("당도" + sugarContent);
	}
}

class FruitBox{
	Object item;
	public void store(Object o) {
		item = o;
	}
	public Object pullOut() {
		return item;
	}
}