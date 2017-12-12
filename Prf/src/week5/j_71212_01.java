package week5;

import java.*;

public class j_71212_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack st = new ArrayStack(5);
		
		st.push(20);
		st.push(40);
		st.push(1);
		st.push(55);
		st.push(13);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
	}
	static int ran() {
		int n = ((int)Math.random() * 9) + 1;
		return n;
	}
}

class ArrayStack{
	int i[];
	int stack=0;
	ArrayStack(int n){
		i = new int[n];
	}
	public void push(int n) {
		if(stack<i.length) {
			i[stack] = n;
			System.out.println("Inserted Item : "+n);
			stack++;
		}
	}
	public void pop() {
		if(stack>0) {
			System.out.println("Pop Item : "+i[stack-1]);
			i[stack-1] = 0;
			stack--;
		} else {
			System.out.println("Over Range Error!");
		}
	}
}