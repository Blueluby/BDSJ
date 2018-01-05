package week8;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class j_80105_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {100, 90,95,85,50};
		
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i=0; i<score.length; i++)
				dos.writeInt(score[i]);
			
			dos.close();
		} catch( IOException ie ) {
			ie.printStackTrace();
		}
	}

}
