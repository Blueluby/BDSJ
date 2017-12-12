package week5;

public class j_71212_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishSub f =  new FishSub();
		f.show();
		System.out.println(f.su);
	}
}

class Fish{
	static int n = 5;
	
	static void show() {
		System.out.println("물고기 갯수 : "+n);
	}
}

class FishSub extends Fish{
	int su = 10;
	static void show() {
		System.out.println("물고기 3마리 추가 ");
	}
}