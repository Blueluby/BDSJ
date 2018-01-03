package week8;

public class j_80103_07 {
	public static void main(String[] args) {
		Runnable r = new Runnable8137();
		new Thread(r).start();
		new Thread(r).start();
	}

}

class Account8137 {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			balance -= money;
		}
	}
}

class Runnable8137 implements Runnable{
	Account8137 acc = new Account8137();
	
	public void run() {
		while(acc.getBalance() >0) {
			int money = (int)(Math.random() * 3 + 1 ) * 100;
			acc.withdraw(money);
			System.out.println("balance : "+acc.getBalance());
		}
	}
}