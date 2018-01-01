package week7.test.concept;

public class Employee extends DefaultProfil{
	private String Ncompany;

	public String getNcompany() {
		return Ncompany;
	}

	public void setNcompany(String ncompany) {
		Ncompany = ncompany;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "[Employ] "+name+", "+phone+", "+Ncompany;
		return printThis();
	}
	
	@Override
	public String printThis() {
		// TODO Auto-generated method stub
		return super.printThis() +"회사 : "+Ncompany;
	}
	
	@Override
	public boolean checker() {
		// TODO Auto-generated method stub
		return super.checker() ? false : Ncompany == "" || Ncompany == null ? false : true;
	}
}