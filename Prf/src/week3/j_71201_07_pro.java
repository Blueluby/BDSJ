package week3;

import java.util.Random;

public class j_71201_07_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~9 사이의 중복되지 않는 숫자로 이루어진 3자리의 숫자를 만드시오
		int [] q= new int[3];
		boolean bf=true;
		
		for(int a=0; a<q.length; a++) {
			q[a] = rd();
			if(a > 0) {
				if(q[a] != q[a-1]) 
					q[a]=rd();
				if(q[a]==q[a-1])//십단위중복
					a-=1;
				if(a==q.length-1)//일단위 중복
					if(q[a]==q[a-2])
						a-=1;
			}
		}
		int sum = q[0]*100 + q[1]*10 + q[2];
			System.out.print(sum);
	}

	public static int rd() {
		return (int)(Math.random() * 9)+1;
	}
}
