package week5;

public class j_71211_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Man{
	private String name;
	public Man() {
		
	}
	public Man(String n) {
		this.name = n;
	}
	public void tellYourName() {
		System.out.println("My Name is "+name);
	}
}

class BusinessMan extends Man{
	private String company;
	private String position;
	public BusinessMan() {}
	public BusinessMan(String nam, String com, String posi) {
		super(nam);
		this.company = com;
		this.position = posi;
	}
}