package week1;

import java.util.*;

public class j_7117_04 {
	public static void main(String[] args) {
		int month = 0;
		
		System.out.print("월 입력 ? :");
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();

		while(month<0 || month > 12) {
			System.out.print("월 입력 ? :");
			month = sc.nextInt();
		}
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄, 봄봄 봄이왔어요~");
			break;
		case 6: case 7: case 8:
			System.out.println("여름아 부탁해");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 아침 햇살");
			break;
		default:
			System.out.println("겨울에 태어난");
		}
	}
}
