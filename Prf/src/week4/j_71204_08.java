package week4;

import java.util.Arrays;

public class j_71204_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[5];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(" "+(numArr[i] = (int)(Math.random() * 10)));
		}
		System.out.println();
		
		for(int i = 0; i<numArr.length-1; i++) {
			boolean changed = false;
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j]>numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			}
			if(!changed)
				break;

			System.out.println(Arrays.toString(numArr));
		}
	}

}
