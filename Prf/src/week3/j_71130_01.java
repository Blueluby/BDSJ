package week3;

public class j_71130_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1차 배열");
		//1차원 배열 : 길이가 1개 배열, 행 하나에 열이 여러개
		//int[] arr = new int[5];
		//int[] arr = new int[] {0,1,2,3,4,5}; //크기 생략은 초기화 할 때만 가능
		int[] arr = {10,12,15,20,0};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
		
		System.out.println("2차 배열");
		//2차원 배열 : 길이가 2인 배열
		//int[][] arr2 = new int[2][3];
		//int[][] arr2 = new int[][] {{1,2,3},{4,5,6}};
		int[][] arr2 = {{1,2,3},{1,2,3}};
		
		arr2[0][0]=1;
		arr2[0][1]=3;
		arr2[0][2]=5;
		arr2[1][0]=7;
		
		for(int i = 0; i<arr2.length; i++) {
			for(int k = 0; k<arr2[i].length; k++) {
				System.out.print("["+arr2[i][k]+"]");
			}
			System.out.println();
		}
		
		int[][] arr3 = new int[][] {{1,3,5},{7,0}};
		
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				System.out.print("arr3["+i+"]의 길이 : "+arr3[i].length+"   ");
			}
			System.out.println();
		}
	}
}