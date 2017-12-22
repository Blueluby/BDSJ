package week6;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class j_71221_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		File f = new File("asdf.txt");
		
		try {
			f.createNewFile();
			System.out.println("파일생성");
			fis = new FileInputStream("아하하");
			dis = new DataInputStream(fis);
			
		} catch (IOException ie) {
			
		} finally {
//			try {
//				dis.close();
//				fis.close();
//			} catch (IOException e) {
//			}
		}
	}

}
