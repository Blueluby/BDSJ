package week8;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class j_80105_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = "test.txt";
			FileInputStream fis = new FileInputStream(filename);
			FileReader fr = new FileReader(filename);
			
			int data = 0;
			
			while((data = fis.read())!=-1) {
				System.out.print((char)data);
			}
					
			System.out.println();
			fis.close();
			
			while((data = fr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
		}catch (IOException e) {
		}
	}

}
