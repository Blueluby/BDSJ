package week8;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class j_80105_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);
		} catch (Exception e) { 
			System.err.print("File not found");
		}
		
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
	}

}
