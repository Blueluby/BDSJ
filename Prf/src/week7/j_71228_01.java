package week7;

import java.util.Arrays;
import java.util.Comparator;

public class j_71228_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"cat", "Dog","lion","tiger"};
		
		Arrays.sort(str);
		System.out.println("str = "+Arrays.toString(str));
		
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
		System.out.println("str = "+Arrays.toString(str));
		
		Arrays.sort(str, new Descending_());
		System.out.println("str = "+Arrays.toString(str));
		
	}
}

class Descending_ implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}