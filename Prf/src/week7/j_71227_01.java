package week7;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class j_71227_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList(10);
		
		ar.add(new Integer(5));
		ar.add(new Integer(4));
		ar.add(new Integer(0));
		ar.add(new Integer(2));
		ar.add(new Integer(1));
		ar.add(new Integer(3));
		ar.add(new Integer(6));
		
		ArrayList ar2 = new ArrayList(ar.subList(1, 4));
		print(ar, ar2);
		
		System.out.println("list1.containsAll(ar):" + ar.containsAll(ar2));
		
		ar2.add("B");
		ar2.add("C");
		ar2.add(3,"A");
		print(ar, ar2);
		
		ar2.set(3, "AA");
		print(ar, ar2);
		
		System.out.println("list1.retainAll(ar):"+ar.retainAll(ar2));
		print(ar,ar2);
		
		for(int i=ar2.size()-1; i>=0; i--) {
			if(ar.contains(ar2.get(i)))
				ar2.remove(i);
		}
		print(ar, ar2);
		
	
	}

	static void print(ArrayList ar1, ArrayList ar2) {
		System.out.println("list 1 : "+ ar1);
		System.out.println("list 2 : "+ ar2);
		System.out.println();
	}
}
