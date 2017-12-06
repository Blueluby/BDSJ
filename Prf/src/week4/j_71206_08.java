package week4;

import java.util.Arrays;

public class j_71206_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j_71206_08 ta = new j_71206_08();
		
		int result = ta.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		ta.add(3, 5, result2);
		System.out.println(result2[0]);
		
		int[] result3 = ta.add(2, 3, 8);
		System.out.println(Arrays.toString(result3));
		
		ta.add(2, 5, 7, result3);
		System.out.println(Arrays.toString(result3));
	}	
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	}
	
	//my
	int[] add(int a, int b, int c) {
		int [] r = new int[3];
		r[0] = a+b;
		r[1] = b+c;
		r[2] = c+a;
		
		return r;
	}
	
	//teacher
	void add(int a, int b, int c, int[] r) {
		r[0] = a+b;
		r[1] = b+c;
		r[2] = c+a;
	}

}
