package week6;

import java.util.ArrayList;

public class j_71222_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitBox_n<Fruit_n> fb = new FruitBox_n<Fruit_n>();
		FruitBox_n<Apple_n> ab = new FruitBox_n<Apple_n>();
		FruitBox_n<Grape_n> gb = new FruitBox_n<Grape_n>();
		
		fb.add(new Fruit_n());
		fb.add(new Apple_n());
		fb.add(new Grape_n());
		
		ab.add(new Apple_n());
		
		gb.add(new Grape_n());
		
		System.out.println(fb);
		System.out.println(ab);
		System.out.println(gb);
		
		
	}

}

interface Eatable_n{}

class Fruit_n implements Eatable_n{
	public String toString() {
		return "Fruit";
	}
}

class Apple_n extends Fruit_n {
	public String toString() {
		return "apple";
	}
}

class Grape_n extends Fruit_n{
	public String toString() {
		return "포도";
	}
}

class Toy {
	public String toString() {
		return "장난감";
	}
}

class FruitBox_n <T extends Fruit_n & Eatable_n> extends Box_n<T> {}

class Box_n<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}