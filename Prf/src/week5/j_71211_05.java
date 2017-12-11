package week5;

public class j_71211_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ct = new CaptionTv();
		ct.channel = 10;
		ct.channelUp();
		System.out.println(ct.channel);
		ct.displayCaption("동물농장");
		ct.caption = true;
		ct.displayCaption("동물농장");
	}

}

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}