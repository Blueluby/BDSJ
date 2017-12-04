package week3;

import java.util.Random;

public class j_71201_07_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~9 사이의 중복되지 않는 숫자로 이루어진 3자리의 숫자를 만드시오
		my();
		System.out.println();
		teach();
	}
	
	public static void teach() {
		
		long startTime = System.currentTimeMillis();

		int[] num = {1,2,3,4,5,6,7,8,9};
		int temp = 0, j=0;
		
		for(int i=0; i<3; i++) {
			j = rd1();
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		
		for(int i=0; i<3; i++) 
			System.out.print(num[i]+" ");
		long endTime = System.currentTimeMillis();
		 
		// Total time
		long lTime = endTime - startTime;
		System.out.println("\nTIME : " + lTime + "(ms)");
	}
	
	public static void my() {
		long startTime = System.currentTimeMillis();

		int [] q= new int[3];
		
		for(int a=0; a<q.length; a++) {
			q[a] = rd();
			if(q[a]==0) //백단위 0일 경우
				q[a]=a;
			if(a > 0) {
				if(q[a] != q[a-1]) //백-십  십-일 중복확인
					q[a]=rd();
				if(q[a]==q[a-1])//십단위중복
					a-=1;
				if(a==q.length-1)//일단위 중복
					if(q[a]==q[a-2])
						a-=1;
			}
		}
		int sum = q[0]*100 + q[1]*10 + q[2];
		System.out.println(sum);

		long endTime = System.currentTimeMillis();
		 
		// Total time
		long lTime = endTime - startTime;
		System.out.println("TIME : " + lTime + "(ms)");
	}

	public static int rd() {
		return (int)(Math.random() * 9)+0;
	}
	
	public static int rd1() {
		return (int)(Math.random() * 9);
	}
}
