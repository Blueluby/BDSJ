package week4;

public class j_71207_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strA = {"100","200","300"};
		
		System.out.println(concat("",  "100","200","300"));
		System.out.println(concat( "100","200","300"));
		System.out.println(concat("-", strA));
		System.out.println("["+concat(",", new String[0])+"]");
		
		
	}
	
	static String concat(String delim, String... arg) {
		String result = "";
		for(String str : arg) {
			result += str + delim;
		}
		return result;
	}

}
