package week8;

import java.io.*;

public class j_80105_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputstream1();
		
		System.out.println();
		
		inputstream2();
	}
	
	static void inputstream1() {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis ;
		DataInputStream dis = null ;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch(EOFException e) {
			System.out.println("정수총합 " + sum + "입니다");
		}catch(IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void inputstream2() {
		int sum = 0;
		int score = 0;
		
		try(FileInputStream fis = new FileInputStream("score.dat");
			DataInputStream dis = new DataInputStream(fis)){
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch ( EOFException eof) {
			System.out.println("정수총합 "+sum + "입니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
