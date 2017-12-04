package week4;

import java.util.Arrays;

public class j_71204_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤값 문자 조합
		rs();
	}
	
	public static void rs() {
		int[] ia1 = new int[10];
		int[] ia2 = new int[10];
		int[] ia3 = {100, 95, 80, 70, 60};
		int[] cha = {'a','b','c','d'};
		
		for(int i= 0; i<ia1.length; i++) {
			ia1[i] = i+1;
		}
		
		for(int i = 0; i<ia2.length; i++) {
			ia2[i] = rd();
		}
		
		for(int i= 0; i<ia1.length; i++) {
			System.out.print(ia1[i]+", ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(ia2));
		System.out.println(Arrays.toString(ia3));
		System.out.println(Arrays.toString(cha));
		System.out.println(ia3);
		System.out.println(cha);
		
	}
	
	public static int rd(){
		return (int)(Math.random() * 10)+1;
	}
}
