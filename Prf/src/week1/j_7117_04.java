package week1;

import java.util.*;

public class j_7117_04 {
	public static void main(String[] args) {
		int month = 0;
		
		System.out.print("���� ������� ? :");
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();

		while(month<0 || month > 12) {
			System.out.print("�ٽ� ���� ? :");
			month = sc.nextInt();
		}
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("�� ���� ���� �Ծ�� �״�� ó�� ������");
			break;
		case 6: case 7: case 8:
			System.out.println("�Բ� ������~ �߾߾߾߾� ��~�ٷ�");
			break;
		case 9: case 10: case 11:
			System.out.println("�̸� ��ħ ���� ���� �뷧�Ҹ� ������� ������ �׷��� �ƽ��� ���� ���� ");
			break;
		default:
			System.out.println("�ܿ￡ �¾ �Ƹ��ٿ� ����� �� ó�� ������ ������ ��� ");
		}
	}
}
