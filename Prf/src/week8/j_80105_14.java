package week8;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class j_80105_14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket server = new ServerSocket(8201);
		System.out.println("ready");
		Socket clientSock = server.accept();
		System.out.println(clientSock);
		OutputStream out = clientSock.getOutputStream();
		byte[] arr = new String("Hello").getBytes();
		out.write(arr);
		
		out.flush();
		
		out.close();
		clientSock.close();
		server.close();
	}

}
