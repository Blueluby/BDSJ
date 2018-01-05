package week8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class j_80104_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;;
		ByteArrayInputStream inp = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream oup = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = inp.read()) != -1) {
			oup.write(data);
		}
		
		outSrc = oup.toByteArray();
		
		System.out.println("in : "+ Arrays.toString(inSrc));
		System.out.println("ou : "+ Arrays.toString(outSrc));
		System.out.println(Arrays.toString(oup.toByteArray()));
		
	}

}
