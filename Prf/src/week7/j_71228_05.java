package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class j_71228_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		ArrayList ar = new ArrayList();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
			if (set.size() == 5)
				ar.add(set);
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);

	}

}
