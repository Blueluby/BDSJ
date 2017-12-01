package week3;

public class j_71201_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for-each문, 향상된 for
		int[] arr = {2,4,6,8,10,12};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		//향상된 for문, for-each문
		for(int su:arr)
			System.out.print(su+" ");
	}

}
