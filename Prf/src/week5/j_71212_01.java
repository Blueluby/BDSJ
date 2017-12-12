package week5;

import java.*;
import java.util.Arrays;

public class j_71212_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack st = new ArrayStack(5);
		
		st.push(20);
		st.push(40);
		st.push(1);
		st.push(55);
		st.push(13);
		
		st.showStack();
		
		st.pop();
		st.pop();
		st.showStack();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		st.showStack();
	}
	static int ran() {
		int n = ((int)Math.random() * 9) + 1;
		return n;
	}
}

class ArrayStack{
	private int i[];
	private int stack=0;
	ArrayStack(int n){
		i = new int[n];
	}
	public void push(int n) {
		if(stack<i.length) {
			System.out.println("Inserted Item : "+n);
			i[stack++] = n;
		}else if(stack==i.length) {
			System.out.println("Inserting fail! Array Stack is full!");
		}
	}
	public void pop() {
		if(stack>0) {
			System.out.println("Pop : "+i[stack-1]);
			i[stack-1] = 0;
			stack--;
		} else if(stack<=0) {
			System.out.println("Deleting fail! Array Stack is empty");
			System.out.println("Pop : "+ (stack-1));
		}
	}
	
	public void showStack() {
		System.out.println(Arrays.toString(i));
	}
}