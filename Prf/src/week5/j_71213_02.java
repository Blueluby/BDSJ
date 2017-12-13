package week5;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.Math.random;
import static java.lang.System.out;

public class j_71213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		out.println("오늘 날짜는 "+date.format(today));
		out.println("지금 시각은 "+time.format(today));
		
	}

}
