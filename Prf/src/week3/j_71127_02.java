package week3;

import java.util.*;

//정사각형 클래스
class Sqrt{
	//한 변의 길이
	int length;
	
	//사각형의 넓이 반환
	int size() {
		return length*length;
	}
}

public class j_71127_02 {
	public static void main(String[] args) {
		//정사각형의 한변의 길이와 크기를 구하는 class
		Sqrt Sq = new Sqrt();
		Scanner s = new Scanner(System.in);
		System.out.print("변 길이 입력 :");
		Sq.length = s.nextInt();
		System.out.println("정사각형의 넓이는 : "+Sq.size());
	}
}