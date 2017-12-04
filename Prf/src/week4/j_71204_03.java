package week4;

public class j_71204_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrcpy();
	}
	
	public static void arrcpy() {
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) 
			arr[i] = i+1;
		
		System.out.println("변경전 - arr.lehgth:" + arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];
		for(int i = 0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;
		
		System.out.println("변경후 - arr.lehgth:"+arr.length);
		for(int i=0; i<arr.length; i++) 
			System.out.println("arr["+i+"]:"+arr[i]);
		
		
	}

}
