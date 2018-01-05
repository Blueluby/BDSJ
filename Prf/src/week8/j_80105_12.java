package week8;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class j_80105_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
}