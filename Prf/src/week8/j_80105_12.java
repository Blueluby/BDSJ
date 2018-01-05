package week8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class j_80105_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serialout();
		
		serialin();
		
	}

	
	public static void serialout() {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			Coll u1 = new Coll();
			Coll u2 = new Coll("에헷", 123);
			
			ArrayList<Coll> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			oos.close();
			System.out.println("직렬화 종료");
		}catch(IOException e) {}
	}
	
	public static void serialin() {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Coll u1 = (Coll) ois.readObject();
			Coll u2 = (Coll) ois.readObject();
			ArrayList<Coll> l1 = (ArrayList<Coll>) ois.readObject();
			
			System.out.println(u1.toString());
			System.out.println(u2.toString());
			System.out.println(l1);
			
			ois.close();
			System.out.println("복구종료");
			
		} catch (Exception e) { }
	}
}

class Coll implements Serializable{
	String a;
	int b;

	public Coll() {
		this("default",1);
	}
	
	public Coll(String a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return a + ", "+b;
	}
	
}