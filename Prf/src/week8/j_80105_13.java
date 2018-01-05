package week8;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class j_80105_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostname(): "+ip.getHostName());
			System.out.println("getHostAddress(): "+ip.getHostAddress());
			System.out.println();
		} catch (UnknownHostException e) { e.printStackTrace(); }
		
		try {
			ipArr = InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<ipArr.length; i++) {
				System.out.println("iparr["+i+"] : "+ipArr[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
