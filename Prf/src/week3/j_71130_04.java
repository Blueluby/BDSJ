package week3;

public class j_71130_04 {
	public static int[] addAllArray(int[] ar, int addval) {
		for(int i=0; i<ar.length; i++) 
			ar[i]+=addval;
		
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int[] ref;
		
		ref = addAllArray(arr, 7);
		
		if(arr == ref) 
			System.out.println("동일 배열 참조");
		else
			System.out.println("다른 배열 참조");
		
		for(int i=0; i<ref.length; i++) 
			System.out.println(arr[i]+" ");
	}

}
