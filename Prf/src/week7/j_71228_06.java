package week7;

import java.util.HashSet;

public class j_71228_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Persion_28_2("david", 10));
		set.add(new Persion_28_2("david", 10));

		System.out.println(set);
	}

}

class Persion_28_1{
	String name;
	int age;
	
	public Persion_28_1(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : "+age;
	}
}

class Persion_28_2{
	String name;
	int age;
	
	public Persion_28_2(String name, int age) {
		// TODO Auto-generated method stub
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Persion_28_2) {
			Persion_28_2 tmp = (Persion_28_2) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	public int hashCode() {
		return (name+age).hashCode();
	}
	public String toString() {
		return name + " : "+age;
	}
}