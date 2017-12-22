package week6;

import java.util.Collection;
import java.util.Collections;

public class j_71222_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box_1 b = new Box_1();
		b.setItem("아하하");
		
		String s = (String)b.getItem();
		
		System.out.println(s);
		
	}
}

class Box_1{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

class Box_2 <T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
//
//class Box_3 <T> {
//	
//	static T item;
//	
//	T[] arr;
//	T[] arr2 = new T[10];
//	Collections.toArray[T[] a];
//	
//	public T getItem() {
//		return item;
//	}
//
//	public void setItem(T item) {
//		this.item = item;
//	}
//}