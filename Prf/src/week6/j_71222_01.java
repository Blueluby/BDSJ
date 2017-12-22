package week6;

import javax.swing.Box;

public class j_71222_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitBox_<Orange_> fBox1 = new FruitBox_<Orange_>();
		fBox1.store(new Orange_(10));
		Orange_ org1 = (Orange_)fBox1.pullOut();
		org1.showSugarContent();
		
//		FruitBox_<String> fBox2 = new FruitBox_<String>();
//		fBox2.store("오렌지");
//		Orange_ org2 = (Orange_)fBox2.pullOut();
//		org2.showSugarContent();
		
		FruitBox_<Apple_> fBox3 = new FruitBox_<Apple_>();
		
		fBox3.store(new Apple_(20));
		Apple_ app = fBox3.pullOut();
		app.showAppleAwight();
		
		Box_<Orange_> fBox4 = new FruitBox_<Orange_>();
		
		
		
	}

}
class Orange_ extends Fruit_{
	int sugarContent;
	
	public Orange_(int i) {
		// TODO Auto-generated constructor stub
		sugarContent = i;
	}
	
	public void showSugarContent() {
		System.out.println(sugarContent);
	}
}

class Apple_ extends Fruit_{
	int weight;
	
	public Apple_(int w) {
		weight = w;
	}
	
	public void showAppleAwight(){
		System.out.println("무게 : " + weight);
	}
}

class Fruit_{
	public void show() {
		System.out.println("과일입니다.");
	}
}

class Box_<T>{
	T item;

	public T pullOut() {
		return item;
	}

	public void store(T item) {
		this.item = item;
	}
	;
}

class FruitBox_ <T extends Fruit_> extends Box_ <T>{
	T item;
	
	public void store(T item) {
		this.item = item;
	}
	
	public T pullOut(){
		return item;
	}
	
}