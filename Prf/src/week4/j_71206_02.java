package week4;

public class j_71206_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 3) {
			System.out.println("usage : java Array Num1 OP Num2");
			System.exit(0);
		}
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[2]);
		char op = args[1].charAt(0);
		int result = 0;
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*': case 'x': case 'X':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		System.out.println(result);
		
	}

}
