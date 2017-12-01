package week3;

import dll.t1;

public class j_71201_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1 stol = new t1();
		
		int r = 0;
		int[] ar = new int[10];
		
		//배열에 1~10 랜덤값 입력 및 1차 출력
		for(int i=0; i<ar.length; i++) {
			ar[i] = (int)(Math.random()*10)+1;
			System.out.print(stol.bracket(ar[i]));
		}
		System.out.println();
		
		//검출
		int[] cnt = new int[ar.length];

		for (int i = 0; i < ar.length; i++)
			cnt[ar[i] - 1]++;
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 1; j < 11; j++) {
//				if(ar[i] == j) {
//					cnt[(j-1)] +=1;
//				}
//			}
//		}
		
		//출력
		for(int i=0; i<cnt.length; i++)
			System.out.println((i+1) + "의 갯수 : "+cnt[i]);
	}
}