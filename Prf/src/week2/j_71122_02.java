package week2;

public class j_71122_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		for(i=0; i<3; i++) {
			System.out.println("바깥"+(i+1)+"차");
			for(j=0; j<3; j++) {
				System.out.println("안쪽"+(j+1)+"차");
			}
			System.out.println("");
		}
		
		vtest();
	}
	
	public static void vtest() {
		int [][]i = new int[5][5];
		
		for(int n=0; n<5; n++) {
			for(int m=0; m<5; m++) {
				i[n][m] = 0;
			}
		}
		
		int a;
		int x=0;
		int y = -1;
		int d = 1;
		int p;
		int cnt=1;
		int jmax=5;
		while(0<=jmax) {
			for(a=0; a<jmax;a++) {
				y+=d;
				i[x][y]=cnt;
				cnt++;
			}
			jmax--;
			for(a=0;a<jmax;a++) {
				x+=d;
				i[x][y]=cnt;
				cnt++;
			}
			d=d*-1;
		}
		
		for(int q=0; q<5; q++) {
			for(int w=0; w<5; w++) {
				System.out.print(i[q][w]+"\t");
			}
			System.out.println("");
		}
	}
}