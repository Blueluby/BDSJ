package dll;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class fl {
	File f;
	private int counter = 0;
	fl(){}
	fl(String name){
		f = createfile(name);
		
	}
	
	public Date getTime() {
		Date dt = new Date(System.currentTimeMillis());
		return dt;
	}
	
	private File createfile(String fileName) {
		try {
			if( fileName == null || fileName.equals("") )
				throw new Exception("파일 이름이 유효하지 않습니다");
		} catch ( Exception e ) {
			fileName = "임시타이틀 "+ counter + ".txt";
		} finally {
			File f = new File(fileName);
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
		}
	}
	
	
}
