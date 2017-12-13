package week5;

import java.util.Arrays;

public class j_71212_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack st = new ArrayStack(5);	//사용자에 입력에 따른 클래스 생성
		
		st.push(20);
		st.push(40);
		st.push(1);
		st.push(55);
		st.push(13);
		
		st.showStack();
		
		st.peek();
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

class ArrayStack{	// 스택 클래스
	private int i[];	//배열
	private int stack=0;	//스택 높이
	ArrayStack(int n){	//생성자
		i = new int[n];	//클래스 선언에 따른 동적 배열 생성
	}
	public void push(int n) {//스택에 넣기
		if(stack<i.length) {//스택 크기보다 스택 높이가 작을 때 동작
			System.out.println("Inserted Item : "+n);
			i[stack++] = n;
		}else if(stack==i.length) {//스택의 높이가 끝에 최고 높이가 되었을 때
			System.out.println("Inserting fail! Array Stack is full!");
		}
	}
	public void pop() {//스택에서 꺼내기
		if(stack>0) {//스택이 바닥보다 많이 쌓였을 때
			System.out.println("Pop : "+i[stack-1]);
			i[stack-1] = 0;
			stack--;
		} else if(stack<=0) {
			System.out.println("Deleting fail! Array Stack is empty");
			System.out.println("Pop : "+ (stack-1));
		}
	}
	public void peek() {
		System.out.println("top에 있는 아이템 출력 :"+i[stack-1]);
	}
	
	public void showStack() {//스택 확인
		System.out.println(Arrays.toString(i));
	}
}