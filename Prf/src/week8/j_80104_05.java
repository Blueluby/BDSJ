package week8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class j_80104_05 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
		FileInputStream fi = new FileInputStream(args[0]);
		FileOutputStream fo = new FileOutputStream(args[1]);
		
		int data = 0;
		while((data = fi.read()) != -1) {
//			char c= (char)data;
//			System.out.print(c);
			fo.write(data);
		}
		fi.close();
		fo.close();
		}catch(IOException ie ) {
			ie.printStackTrace();
		}
	}

}
