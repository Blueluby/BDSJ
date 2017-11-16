package week1;

import java.util.*;

public class j_7116_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in;
		
		System.out.print("숫자입력 :");
		
		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		in = Integer.parseInt(tmp);
		
		in = sc.nextInt();
		
		if(in==0) {
			System.out.println("입력한 숫자는 0");
		}
		
		if(in != 0) {
			System.out.println("입력한 숫자는 0이 아님");
			System.out.println("입력한 숫자는 "+in+" 임");
			
		}
	}

}
