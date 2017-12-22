package week6;

import java.util.ArrayList;

public class j_71222_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxEx1<FruitEx1> fb = new BoxEx1<FruitEx1>();
		BoxEx1<AppleEx1> fb1 = new BoxEx1<AppleEx1>();
//		BoxEx1<GrapeEx1> fb2 = new BoxEx1<GrapeEx1>();
		BoxEx1<ToyEx1> fb3 = new BoxEx1<ToyEx1>();
		
		fb.add(new FruitEx1());
		fb.add(new AppleEx1());
		
		fb1.add(new AppleEx1());
		fb1.add(new AppleEx1());
//		fb1.add(new ToyEx1());
		
		fb3.add(new ToyEx1());
//		fb3.add(new AppleEx1());
		
		System.out.println(fb);
		System.out.println(fb1);
		System.out.println(fb3);
		
	}

}

class FruitEx1{
	public String toString() {
		return "Fruit";
	}
}
class AppleEx1 extends FruitEx1{
	public String toString() {
		return "Apple";
	}
}
class GrapeEx1 extends FruitEx1{
	public String toString() {
		return "Grape";
	}
}
class ToyEx1{
	public String toString() {
		return "Toy";
	}
}

class BoxEx1<T>{
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