package week7.test.concept;

public class DefaultProfil{
	protected String name;
	protected String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public DefaultProfil() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "[default] "+name+", "+phone;
		return printThis();
	}
	
	public String printThis() {
		return "이름 : "+name +"\n"+ "전화번호 : "+phone;
	}
	
	public boolean checker() {
		if(name==null || phone == null || name == "" || phone == "")
			return false;
		else
			return true;
	}
}