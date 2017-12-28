package week7;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber_{
	int num;
	
	public SimpleNumber_(int n) {
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
	}
}
public class j_71228_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<SimpleNumber_> ha = new HashSet<SimpleNumber_>();
		ha.add(new SimpleNumber_(10));
		ha.add(new SimpleNumber_(20));
		ha.add(new SimpleNumber_(20));
		
		System.out.println("저장된 데이터 수 : "+ha.size());
		
		Iterator<SimpleNumber_> it = ha.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
