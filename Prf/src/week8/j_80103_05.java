package week8;

public class j_80103_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//main thread가 block상태에 빠짐
		//중간에 다른 thread를 참여시킨다 해서 join이라 한다
		//main thread는 join된 다른 thread가 종료되기를 기다린다 -> main의 block상태
		
		System.out.println("main 시작");
		
		NumCount0135 n = new NumCount0135();
		AlphabetCount0135 a = new AlphabetCount0135();
		
		n.start();
		a.start();
		
		try {
			n.join();
			a.join();
		} catch (InterruptedException e) { }
		
		System.out.println("메인끝");
	}

}

class NumCount0135 extends Thread{
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println(i);
	}
}

class AlphabetCount0135 extends Thread{
	public void run() {
		for(char ch = 'a'; ch<='z'; ch++)
			System.out.println(ch);
	}
}