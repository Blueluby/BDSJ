package week8;

public class j_80102_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data812 d = new Data812();
		
		Sync812_07 s1 = new Sync812_07(d, "첫");
		Sync812_07 s2 = new Sync812_07(d, "둘");
		
		s1.start();
		s2.start();
	}

}

class Data812 {
	private int num = 0;
	
	synchronized public void increment(String name) {
		num++;
		System.out.println(name + " 가 접근 : " + num);
	}
}

class Sync812_07 extends Thread{
	Data812 d;
	String name;
	
	public Sync812_07(Data812 d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {	//Thread class의 method 오버라이딩
		
		for(int i = 0; i<5; i++) {
			try {
				sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
			d.increment(name);
		}
	}
}