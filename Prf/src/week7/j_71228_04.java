package week7;

import java.util.HashSet;
import java.util.Set;

public class j_71228_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] obj = {"1", new Integer(1), "2", "2", "3", "3", "4","4","4"};
		
		Set set = new HashSet();
		
		for(int i=0; i<obj.length; i++) {
			set.add(obj[i]);
		}
		
		System.out.println(set);
	}

}
