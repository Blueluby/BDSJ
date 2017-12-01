package week3;

public class j_71201_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = new int[] {11,15,21,55,60};
		for(int i=0; i<ia.length; i++)
			System.out.print(ia[i] + " ");
		System.out.println();
		
		for(int e:ia) {
			e+= 2;
			System.out.print(e+" ");
		}
		System.out.println();
		
		for(int e:ia)
			System.out.print(e + " ");
	}

}
