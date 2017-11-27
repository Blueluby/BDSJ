package week3;

class TV{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class j_71127_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV();
		TV t2 = new TV();
		
		System.out.println(t1.channel+"채널");
		System.out.println(t2.channel+"채널");
		
		t1.channel = 7;
		System.out.println("t1 채널 7");
		
		System.out.println(t1.channel+"채널");
		System.out.println(t2.channel+"채널");
	}

}
