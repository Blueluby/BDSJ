package week8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class j_80105_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("asdf.txt");
			FileWriter fw = new FileWriter("test.txt");
			
			int data = 0;
			
			while((data = fr.read()) != -1) {
				if(data != '\t' && data !=' ' &&data != '\r')
					fw.write(data);
			}
			
			fr.close();
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
