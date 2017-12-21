package week6;

import java.io.File;
import java.io.FileInputStream;

public class j_71220_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일이 성공적으로 생성됨");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바람");
		}
	}

	private static File createFile(String fileName) throws Exception {
		// TODO Auto-generated method stub
		
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일 이름 유효하지 않음");
		File f = new File(fileName);
		f.createNewFile();
		
		FileInputStream fio = new FileInputStream(f);
		fio.close();
		
		return f;
	}

}
