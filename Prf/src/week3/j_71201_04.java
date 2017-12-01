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
		
//		arr[0].num = 5;
//		arr[1].num = 10;
//		arr[2].num = 15;
		for(int i=0; i<arr.length; i++)
			arr[i].num = 5*(i+1);
		
		for(int i=0; i<arr.length; i++)
			arr[i].setNum(5*(i+1));
		
		for(aNumber e:arr)
			e.num++;
		
		for(aNumber e:arr)
			System.out.println(e.getNum()+" ");
	}
}