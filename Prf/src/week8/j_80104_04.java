package week8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class j_80104_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] inSrc = {01,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
		ByteArrayInputStream bai = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		
		System.out.println("Input source : "+Arrays.toString(inSrc));
		
		try {
			while(bai.available() > 0) {
//				bai.read(temp);
//				bao.write(temp);
//				
//				outSrc = bao.toByteArray();
//				printArrays(temp, outSrc);
				
				int len = bai.read(temp);
				bao.write(temp, 0, len);
			}
		}catch (IOException e) {}
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : "+Arrays.toString(temp));
		System.out.println("output Source : "+Arrays.toString(outSrc));
	}
}
