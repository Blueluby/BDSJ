package week1;

import java.util.*;

public class j_7117_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Lotto[] = new int[6];
		// �迭 ����
		int w = 0;
		int [][]b = new int[46][7];
		
		
		while (w < 46) {
			System.out.print("Lotto ���� ���ڴ� ");
			for (int i = 0; i < Lotto.length; i++) {
				Lotto[i] = (int) (Math.random() * 45) + 1;
				// ���� �� ��ȯ
				for (int j = 0; j < i; j++) {
					if (Lotto[i] == Lotto[j]) {
						i--;
						break;
					} // �ߺ� �� ����1
				}
			}
			for (int i = 0; i < Lotto.length; i++) {
				System.out.print(Lotto[i] + " ");
				b[w][i]=Lotto[i];
			}
			w++;
		}
		
		for(int a = 0; a<46; a++) {
			System.out.print(a+". ");
			for(int c = 0; c<6; c++) {
				System.out.print(b[a][c]+" ");
			}
			System.out.println("");
		}
	}
}