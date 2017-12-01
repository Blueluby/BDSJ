package week3;

class aNumber{
	public int num;
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
}

public class j_71201_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aNumber[] arr = new aNumber[] {
				new aNumber(),
				new aNumber(),
				new aNumber()
		};
		
		for(aNumber e:arr)
			e.num++;
		
		for(aNumber e:arr)
			System.out.println(e.getNum()+" ");
	}
}