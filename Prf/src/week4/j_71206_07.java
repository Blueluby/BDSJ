package week4;

import java.util.Arrays;

public class j_71206_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,2,1,5,9,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = "+sumArr(arr));
	}
	
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length;i++) 
			sum+= arr[i];
		return sum;
	}
	static void printArr(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++)
			for(int j=0; j<arr.length-1-i; j++)
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
	}

	
}
