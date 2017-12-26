package week6;

import java.util.ArrayList;

public class j_71222_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitBox_10<Fruit_10> fb = new FruitBox_10<Fruit_10>();
		FruitBox_10<Apple_10> ab = new FruitBox_10<Apple_10>();
		
		fb.add(new Apple_10());
		fb.add(new Grape_10());
		
		ab.add(new Apple_10());
		ab.add(new Apple_10());
		
		System.out.println(Juicer_10.makeJuice(fb));
		System.out.println(Juicer_10.makeJuice(ab));
		
		
		
	}

}

class Fruit_10{
	public String toString() {
		return "과일";
	}
}
class Apple_10 extends Fruit_10{
	public String toString() {
		return "사과";
	}
}
class Grape_10 extends Fruit_10{
	public String toString() {
		return "포도";
	}
}
class Juice_10{
	String name;
	
	public Juice_10(String name) {
		this.name = name + " 주스";
	}
	public String toString() {
		return name;
	}
}

class Juicer_10{
	static Juice_10 makeJuice(FruitBox_10<? extends Fruit_10> box) {
		String tmp = "";
		
		for(Fruit_10 f : box.getList())
			tmp += f + " ";
		return new Juice_10(tmp);
	}
}

class FruitBox_10<T extends Fruit_10> extends Box_10<T>{}

class Box_10<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}