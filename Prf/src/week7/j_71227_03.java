package week7;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class j_71227_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList(2000000);
		LinkedList l1 = new LinkedList();
		
		System.out.println("추가");
		System.out.println("array : "+ add1(a1));
		System.out.println("linked: "+ add1(l1));
		System.out.println();
		
		System.out.println("중간난입");
		System.out.println("array : "+ add2(a1));
		System.out.println("linked: "+ add2(l1));
		System.out.println();
		
		System.out.println("중간퇴장");
		System.out.println("array : "+ remove2(a1));
		System.out.println("linked: "+ remove2(l1));
		System.out.println();          
		                               
		System.out.println("순서퇴장");    
		System.out.println("array : "+ remove1(a1));
		System.out.println("linked: "+ remove1(l1));
		System.out.println();
		
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			list.add(i+"");
		
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove1(List list){
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i>=0; i--){
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++)
			list.remove(i);
		
		long end = System.currentTimeMillis();
		return end-start;
	}
}