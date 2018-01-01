package week7.test.concept;

public class Academic extends DefaultProfil{
	private String Prof;
	private int grade;
	
	public String getProf() {
		return Prof;
	}

	public void setProf(String prof) {
		Prof = prof;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Academic() {
		// TODO Auto-generated constructor stub
	}
	
	public Academic(String a, String b, String c, int d) {
		// TODO Auto-generated constructor stub
		name = a;
		phone = b;
		Prof = c;
		grade = d;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "[academic]"+name+", "+phone+", "+Prof+", "+grade;
		return printThis();
	}
	
	@Override
	public String printThis() {
		// TODO Auto-generated method stub
		return super.printThis()+"\n"+"전공 : "+ Prof +"\n"+"학년 : "+grade;
	}
	
	@Override
	public boolean checker() {
		// TODO Auto-generated method stub
		return super.checker() ? false : Prof == null || Prof == "" ? false : true ;
	}
}