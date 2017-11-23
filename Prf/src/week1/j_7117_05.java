package week1;

import java.util.*;

public class j_7117_05 {

	public static int[] cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Lotto[] = new int[6];
		// �迭 ����
		int w = 0;
		int [][]b = new int[46][6];
		
		cnt = new int[46];
		
		while (w < 46) {
			//System.out.print("Lotto 생성 ");
			for (int i = 0; i < Lotto.length; i++) {
				Lotto[i] = (int) (Math.random() * 45) + 1;
				// 중복숫자 제거
				for (int j = 0; j < i; j++) {
					if (Lotto[i] == Lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < Lotto.length; i++) {
				//System.out.print(Lotto[i] + " ");
				b[w][i]=Lotto[i];
			}
			Arrays.sort(b[w]);
			w++;
		}
		
		for(int a = 0; a<46; a++) {
//			System.out.print(a+". ");
			for(int c = 0; c<6; c++) {
//				System.out.print(b[a][c]+" ");
			}
//			System.out.println("");
		}
		
		for(int i=0; i<45; i++) {
			for(int j=0; j<6; j++) {
				counter(b[i][j]);
			}
//			System.out.println(i + ". " + cnt[i]);
		}
		
		System.out.println("�̰��� ����ǥ�̴�");
		for(int i=0; i<46; i++) {
			System.out.print("["+i+"] "+ cnt[i]+"\t");
			if(i%10==0)
				System.out.println("");
		}
		System.out.println("\n\n");
		
		
		hist();
		
	}
	
	public static void counter(int n) {
		for(int a=0; a<46; a++) {
			if(a==n) {
				cnt[a] += 1;
			}
		}
		
	}
	
	public static void hist() {
		int[] topLotto = new int[6];
//		topLotto[0]=cnt[0];
//		topLotto[1]=cnt[0];
//		topLotto[2]=cnt[0];
//		topLotto[3]=cnt[0];
//		topLotto[4]=cnt[0];
//		topLotto[5]=cnt[0];
		
		int[] pos = new int[6];
		
		int ln = cnt.length;

		for(int i=0; i<6; i++) {
			for(int j=0; j<ln; j++) {
				if(topLotto[i]>cnt[j]) {
					topLotto[i]=cnt[j];
					pos[i]=j;
				}
			}
			System.out.println("���� ū ��ȣ : "+ topLotto[i]+",\tpos : "+pos[i]);
			System.out.print("�ʱ�ȭ �� : "+cnt[pos[i]] + "\t");
			cnt[pos[i]]=0;
			System.out.println("�ʱ�ȭ �� : "+cnt[pos[i]]);
		}
		
		
		/*
		for (int m = 0; m < 6; m++) {
//			if(m>1) {
//				cnt[pos[m-1]]=0;
//			}
			for (int i = 0; i < ln; i++) {
				if (topLotto[m] < cnt[i]) {
					System.out.println("���� ���� : "+cnt[i]+ "��ġ : "+i);
					topLotto[m] = cnt[i];
					pos[m] = i;
				}
			}
			if(m>=1) {
				System.out.println(cnt[pos[m]]);
				cnt[pos[m-1]] = 0;
			}
			//System.out.print(pos[m]+", ");
		}
//		for(int m=0;m<6;m++)
			//System.out.println(" ���� ���� ���� Ƚ�� : "+topLotto[m]+", ���? : "+pos[m]);
		 */
		
		
	}
}