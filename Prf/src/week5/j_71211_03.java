package week5;

public class j_71211_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.pay();
		s.money -= 300000;
		s.pay();
		s.study();
	}
}

class Mother{
	int money = 10000000;
	
	public void pay() {
		System.out.println("남는 돈 : "+money);
	}
}

class Son extends Mother{
	public void study() {
		System.out.println("공부중");
	}
}