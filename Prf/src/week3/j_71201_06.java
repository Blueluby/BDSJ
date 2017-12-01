package week3;

import java.util.Arrays;

public class j_71201_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score.length;
		
		for(int i=0 ; i < 5; i++) {
			System.out.println("score"+i+":"+score[i]);
		}
		
		System.out.println(Arrays.toString(score));
		
		System.out.println("score:"+score);
		System.out.println("tmp:"+tmp);
	}

}
