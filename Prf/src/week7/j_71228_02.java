package week7;

import java.util.HashSet;
import java.util.Iterator;

public class j_71228_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hS = new HashSet<String>();
		
		hS.add("First");
		hS.add("Second");
		hS.add("Third");
		hS.add("First");
		
		System.out.println("저장된 데이터 수 : "+hS.size());
		
		Iterator<String> it = hS.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
