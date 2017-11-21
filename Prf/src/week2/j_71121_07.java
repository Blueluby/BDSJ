package week2;

import java.util.*;

public class j_71121_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("구구단 단수 입력(정수) : ");
		i = s.nextInt();
		
		for(int j=0; j<10; j++) {
			if(j==0)
				System.out.println("["+i+"단]");
			else
				System.out.println(i +"x"+ j +"="+i*j);
		}
	}
}