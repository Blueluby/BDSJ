package week2;

public class j_71120_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		int tmp=0;
		int sum = 0;
		String str = "";
		while(cnt<101) {
			if((cnt%2==0) && (cnt%7==0)) {
				str = cnt + ", ";
				sum += cnt;
				if(cnt>90)
					str = cnt+"";
				System.out.print(str);
			}
			cnt++;
		}
		System.out.println("\n"+sum);
	}
}