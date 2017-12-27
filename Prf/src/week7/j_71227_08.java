package week7;

import java.util.ArrayList;
import java.util.Iterator;

public class j_71227_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList original = new ArrayList(10);
		ArrayList cop1 = new ArrayList(10); 
		ArrayList cop2 = new ArrayList(10);
		
		for(int i=0; i<10; i++)
			original.add(i+ "");
		
		Iterator it = original.iterator();
		
		while(it.hasNext())
			cop1.add(it.next());
		
		System.out.println("= Origianl에서 copy1로 복사(copy)=");
		System.out.println("original : "+original);
		System.out.println("copy1 : "+cop1);
		System.out.println();
		
		it = original.iterator();
		
		while(it.hasNext()) {
			cop2.add(it.next());
			it.remove();
		}
		
		System.out.println("= Original에서 copy2로 이동(move) =");
		System.out.println("original : "+original);
		System.out.println("copy2 : "+cop2);
		System.out.println();
		
	}

}
