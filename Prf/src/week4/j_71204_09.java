package week4;

import java.util.Arrays;

public class j_71204_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시간제한
		my();
		goal();
	}
	
	public static void my() {
		int[] ar = { 3, 1, 4, 2, 0 };
		int ck = 0;
		System.out.println(Arrays.toString(ar));

		for (int i = 0; i < ar.length - 1; i++) {
			// ck=i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[ck])
					ck = j;
			}
			int tmp = ar[i];
			ar[i] = ar[ck];
			ar[ck] = tmp;

			System.out.println(Arrays.toString(ar));
		}
		
		System.out.println("\n");
	}
	
	public static void goal() {
		int[] arr= {3,1,4,2,0};
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}
	}
}