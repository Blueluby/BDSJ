package week4;

import java.util.Scanner;

public class j_71206_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words= {
				{"char","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while(true) {
			//for(int i=0; i<words.length; i++) {
			int rand = (int)(Math.random() * 3);
			//System.out.println("Q"+i+". "+words[rand][0]+"의 뜻은?");
			System.out.println("Q"+cnt+". "+words[rand][0]+"의 뜻은?");
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[rand][1])) {
				System.out.println("정답");
			}else {
				System.out.println("틀렸. 답은 "+words[rand][1]);
			}
			if(tmp.equals("x")) {
				System.out.println("종료합니다");
				break;
			}
			cnt++;
		}
	}

}
