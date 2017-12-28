package week7;

import java.util.HashMap;

public class j_71228_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(new Integer(3), "나삼번");
		hm.put(5, "윤오번");
		hm.put(8, "박팔번");
		
		System.out.println("8번 학생 : "+hm.get(new Integer(8)));
		System.out.println("5번 학생 : "+hm.get(5));
		
		
		hm.remove(5);
		System.out.println("5번 학생 : "+hm.get(5));
		hm.put(8, "박오번");
		hm.put(9, "박오번");
		System.out.println("8번 학생 : "+hm.get(8));
		
		System.out.println(hm);
	}

}
