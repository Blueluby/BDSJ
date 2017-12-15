package week5;

public class J_71215_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer();
		b.buy(new _Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
		System.out.println("잔고 : "+b.money);
		System.out.println("마일리지 : "+b.bounusPoint);
		
	}
}

class Buyer{
	int money = 1000;
	int bounusPoint = 0;
	Product[] item = new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bounusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"을(를) 구매하셨습니다");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입한 물품 총액 : "+sum);
		System.out.println("구입한 리스트는 : " + itemList);
	}
}
class Product{
	int price;
	int bonusPoint;
	
	Product(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class _Tv extends Product{
	_Tv(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}