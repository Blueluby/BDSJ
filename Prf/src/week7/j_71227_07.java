package week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class j_71227_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator it = list.listIterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		while(it.hasPrevious()) 
			System.out.println(it.previous());
		
		System.out.println();
	}

}
