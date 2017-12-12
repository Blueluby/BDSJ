package week5;

public class j_71211_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son("홍길동","EY");
		s.pay();
		s.money -= 300000;
		s.pay();
		s.study();
		System.out.println("\n*--------------------*\n");
		s.showName();
		
		s.pay();
		
	}
}

class Mother{
	protected int money = 10000000;
	String nameMother;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Mother() {
		
	}
	public Mother(String s) {
		this.nameMother = s;
	}
	public void pay() {
		System.out.println("남는 돈 : "+money);
	}
}

class Son extends Mother{
	String nameSon;
	int money = 200000;
	public Son(String s) {
		this.nameSon = s;
	}
	public Son(String s, String m) {
		super(m);
		this.nameSon = s;
	}
	public void study() {
		System.out.println("공부중");
	}
	public void showName() {
		System.out.println("어머니 성함 : "+nameMother);
		System.out.println("아들 이름 : "+nameSon);
	}
	@Override
	public void pay() {
		System.out.println("son의 메서드");
		System.out.println("son 돈 : "+ this.money);
		System.out.println("mother의 돈 : "+super.money);
	}
	public void pay(int mm) {
		System.out.println("정의");
	}
	
}