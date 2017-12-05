package week4;

public class j_71205_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi";
		String s2 = "hahahaha hi";
		
		System.out.println(s1.charAt(1));
		System.out.println(s2.substring(2,6));
		System.out.println(s2.substring(2));
		System.out.println(s1.equals("Hi"));
		System.out.println(s2.toCharArray());
		
		char[] ch = s2.toCharArray();
		
		ch[2] = 'i';
		
		System.out.println(ch);
		
	}

}
