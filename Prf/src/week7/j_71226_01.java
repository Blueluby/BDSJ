package week7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class j_71226_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitBox_26<Apple_26> apb = new FruitBox_26<Apple_26>();
		FruitBox_26<Grape_26> grb = new FruitBox_26<Grape_26>();
		
		apb.add(new Apple_26("GreenApple", 300));
		apb.add(new Apple_26("redJem", 500));
		apb.add(new Apple_26("RedApple", 200));
		
		grb.add(new Grape_26("GreenGrape", 300));
		grb.add(new Grape_26("PurpleGrape", 200));
		grb.add(new Grape_26("WhiteGrape", 500));
		
		System.out.println(apb);
		System.out.println(grb);
		System.out.println();
		
		Collections.sort(apb.getList(), new AppleComp_26());
		Collections.sort(grb.getList(), new GrapeComp_26());
		
		System.out.println(apb);
		System.out.println(grb);
		System.out.println();
		
		Collections.sort(apb.getList(), new FruitComp_26());
		Collections.sort(grb.getList(), new FruitComp_26());
		
		System.out.println(apb);
		System.out.println(grb);
		System.out.println();
		
	}
}

class Fruit_26{
	String name;
	int weight;
	public Fruit_26(String name, int weight) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name + " ( "+weight + " ) ";
	}
}

class Apple_26 extends Fruit_26{
	public Apple_26(String name, int weight) {
		// TODO Auto-generated constructor stub
			super(name, weight);
	}
}

class Grape_26 extends Fruit_26{
	public Grape_26(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp_26 implements Comparator<Apple_26>{
	public int compare(Apple_26 t1, Apple_26 t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp_26 implements Comparator<Grape_26>{
	public int compare(Grape_26 t1, Grape_26 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp_26 implements Comparator<Fruit_26>{
	public int compare(Fruit_26 t1, Fruit_26 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitBox_26<T extends Fruit_26> extends Box_26<T>{}

class Box_26<T>{
	
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
	ArrayList<T> getList(){
		return list;
	}
	public String toString(){
		return list.toString();
	}
	
}
