package week3;

public class j_71201_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score= {79,88,91,33,89,55,95, 98, 55, 95, 10};
		
//		int max=0;
//		int min=100;
	
		int max = score[0];
		int min = score[0];

		for (int m = 0; m < score.length; m++) {
			if (max < score[m]) {
				System.out.print("최대값 갱신 : " + max + "->");
				max = score[m];
				System.out.println(score[m]);
			} else if (min > score[m]) {
				System.out.print("최소값 갱신 : " + min + "->");
				min = score[m];
				System.out.println(score[m]);
			}
		}
		
		System.out.println("\n최종");
		System.out.println("최대:"+max);
		System.out.println("최소:"+min);
	}
}