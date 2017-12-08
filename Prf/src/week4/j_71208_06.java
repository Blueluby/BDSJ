package week4;

import java.util.Arrays;

public class j_71208_06 {
	static int [] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10)+1;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(j_71208_06.arr));
	}

}
