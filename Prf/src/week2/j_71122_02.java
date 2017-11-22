package week2;

import java.util.*;
import java.util.logging.*;

public class j_71122_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		for(i=0; i<3; i++) {
			System.out.println("바깥"+(i+1)+"차");
			for(j=0; j<3; j++) {
				System.out.println("안쪽"+(j+1)+"차");
			}
			System.out.println("");
		}
		
		vtest();
	}
	
	public static void vtest() {
		
		int x = 0;
		int y = -1;
		int a, si , d = 1, cnt=1, jmax=5;
		
		Scanner s = new Scanner(System.in);
		System.out.print("배열입력 :");
		si = s.nextInt();
		
		int [][]i = new int[si][si];
		//int [][]i = new int[5][5];
		jmax = si;
		
		while(0<=jmax) {
			for(a=0; a<jmax;a++) {
				y+=d;
				i[x][y]=cnt;
				cnt++;
			}
			jmax--;
			for(a=0;a<jmax;a++) {
				x+=d;
				i[x][y]=cnt;
				cnt++;
			}
			d=d*-1;
		}
		
		for(int q=0; q<si; q++) {
			for(int w=0; w<si; w++) {
				System.out.print(i[q][w]+"\t");
			}
			System.out.println("");
		}
	}
}