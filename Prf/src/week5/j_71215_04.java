package week5;

import java.util.Vector;

public class j_71215_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector item = new Vector();
		
		show(item);
		
		item.add(new _Tv());
		
		item.add(new Computer());
		item.add(new Audio());
		show(item);
		
		System.out.println(item.size());
		
		item.remove(1);
		System.out.println(item.size());
		show(item);
	}

	public static void show(Vector v) {

		if(v.isEmpty())
			System.out.println("비었");
		else
			System.out.println(v);
		
	}
}
