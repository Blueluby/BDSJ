package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_80104_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		System.out.print("문자 입력 :");
		String str = br.readLine();
		System.out.println("입력받은 문자열  : "+str);
		
		System.out.print("문자 입력 :");
		int n2 = Integer.parseInt(br.readLine());
		System.out.println("입력받은 문자열  : "+n2);
		
		
	}

}
