package week8;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class j_80104_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i='1'; i <= '9'; i++) {
				bos.write(i);
			}
			bos.flush();
			fos.close();
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
