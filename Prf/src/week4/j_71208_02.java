package week4;

public class j_71208_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buy = new Buyer();
		Seller sel = new Seller();

		sel.show();
		buy.show();

		// 돈 범위로 구매
		buy.buyA(sel, 2000);

		sel.show();
		buy.show();

		// 개수로 구매
		buy.buyB(sel, 3);

		sel.show();
		buy.show();
	}

}

class Buyer {
	private int sagwa;
	private int money;
	private String name;

	Buyer() {
		money = 5000;
		sagwa = 0;
		name = "구매자";
	}

	public void show() {
		System.out.println(name);
		System.out.println("남은 사과 :" + sagwa);
		System.out.println("보유 금액 : " + money);
	}

	// 얼마치 내고 사과 사오기
	public void buyA(Seller sel, int pay) {
		System.out.println("산다! 사과! 낸다! 돈!");
		sagwa += sel.sellP(pay);
		money -= pay;
	}
	// 몇개주세요 사과 사기
	public void buyB(Seller sel, int count) {
		System.out.println("산다! 사과! 낸다! 돈!");
		sagwa += count;
		money -= sel.sellC(count);
	}
}

class Seller {
	private int sagwa;
	private int money;
	final int aprice = 1000;
	String name;

	public int getSagwa() {
		return sagwa;
	}
	public void setSagwa(int sagwa) {
		this.sagwa = sagwa;
	}
	public int getmoney() {
		return money;
	}
	public void setmoney(int _money) {
		this.money = _money;
	}

	Seller() {
		name = "사과팔이";
		sagwa = 20;
		money = 0;
	}

	public void show() {
		System.out.println(name);
		System.out.println("남은 사과 :" + sagwa);
		System.out.println("보유 금액 : " + money);
	}
	//얼마치주세요 사과팔기
	public int sellP(int pay) {
		int num = pay / aprice;
		sagwa -= num;
		money += pay;
		return num;
	}
	//몇개주세요 사과팔기
	public int sellC(int count) {
		sagwa -= count;
		money += count * aprice;
		return count * aprice;
	}
}