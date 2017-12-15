package week5;

import java.util.Vector;

public class j_71215_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VBuyer b = new VBuyer();
		_Tv tv = new _Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refunt(com);
		b.summary();
		
	}

}

class VBuyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+" 구입");
	}
	
	void refunt(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품");
		} else {
			System.out.println("구매내역이 없음");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("내역이 없음");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", "+p;
		}
	}
}

