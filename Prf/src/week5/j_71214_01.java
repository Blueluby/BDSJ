package week5;

public class j_71214_01 {

	private static final int User_NUM = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User[] user = new User[User_NUM];
		
		for(int i = 0; i<User_NUM; i++) {
			user[i] = new User((i+1)+"-user");
			user[i].print();
		}
	}

}

class User{
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer= Printer.getPrinter();
		printer.print(this.name + "print using "+printer.toString()+".");
	}
}

class Printer{
	
	private static Printer p = new Printer();
	private Printer() {}
	
	public void print(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

	static Printer getPrinter() {
		if(p==null)
			return p = new Printer();
		return p;
	}
}