package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_80105_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "";
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader	  br = new BufferedReader(isr);
			
			System.out.println("os 인코딩 : "+isr.getEncoding());
			
			do {
				System.out.print("문장 입력 종료 q > ");
				line = br.readLine();
				System.out.println("입력한 문장 : "+line);
			}while(!line.equalsIgnoreCase("q"));
			System.out.println("종료");
		}catch (IOException e) { }
		
	}

}
