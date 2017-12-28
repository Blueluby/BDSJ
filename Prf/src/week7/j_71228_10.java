package week7;

import java.util.HashMap;
import java.util.Scanner;

public class j_71228_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mp = new HashMap();
		mp.put("myId", "1234");
		mp.put("asdf", "1111");
		mp.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			System.out.println();
			
			System.out.print("password : ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!mp.containsKey(id)) {
				System.out.println("입력한 아이디는 존재하지않음 다시입력하셈");
				continue;
			} else {
				if(!(mp.get(id)).equals(pw)) {
					System.out.println("아디비번일치");
					break;
				}
			}
			
		}
	}

}
