package week1;

import java.util.*;

public class j_7116_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		System.out.printf("���ڸ� �ϳ� �Է��ϼ��� = ");
		
		String in = sc.nextLine();
		ch = in.charAt(0);
		
		if('0'<=ch && ch <='9') {
			System.out.printf("�Է��� ���� %d\n", (int)ch);
		}
		if(('a'<=ch && ch <='z')||('A'<=ch && ch <= 'Z')) {
			System.out.printf("�Է��� ������ : %c\n", ch);
		}
		
	}

}
