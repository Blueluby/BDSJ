package week7;

import java.util.Stack;

public class j_71227_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression : "+expression);
		
		try {
			
			for(int i = 0; i< expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(')
					st.push(ch + "");
				else if( ch == ')')
					st.pop();
			}
			
			if(st.isEmpty()) 
				System.out.println("괄호 일치");
			else
				System.out.println("일치 안함");
			
		} catch (Exception e) {
			System.out.println("일치안함");
		}
		
		
	}

}
