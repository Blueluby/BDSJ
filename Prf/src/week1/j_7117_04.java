package week1;

import java.util.*;

public class j_7117_04 {
	public static void main(String[] args) {
		int month = 0;
		
		System.out.print("오늘 몇월인지 ? :");
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();

		while(month<0 || month > 12) {
			System.out.print("다시 물음 ? :");
			month = sc.nextInt();
		}
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄 봄봄 봄이 왔어요 그대와 처음 만났던");
			break;
		case 6: case 7: case 8:
			System.out.println("함께 떠나자~ 야야야야야 바~다로");
			break;
		case 9: case 10: case 11:
			System.out.println("이른 아침 작은 새들 노랫소리 들려오면 언제나 그랬듯 아쉽게 잠을 깬다 ");
			break;
		default:
			System.out.println("겨울에 태어난 아름다운 당신은 눈 처럼 깨끗한 나만의 당신 ");
		}
	}
}
