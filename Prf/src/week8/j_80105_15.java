package week8;

import java.io.InputStream;
import java.net.Socket;

public class j_80105_15 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket sock = new Socket("127.0.0.1",8201);
		System.out.println("연결됨 "+sock);
		InputStream in = sock.getInputStream();
		byte[] buffer = new byte[10];
		int count = in.read(buffer);
		System.out.println("count : "+count);
		String str = new String(buffer);
		System.out.println(str);
		in.close();
		sock.close();
	}

}
