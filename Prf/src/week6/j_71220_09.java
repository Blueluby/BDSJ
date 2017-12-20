package week6;

import java.io.File;
import java.util.Scanner;

public class j_71220_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] strs = new String[3];
		
		for(int i=0; i<strs.length; i++) {
			System.out.print("파일명 : ");
			strs[i] = sc.nextLine();
		}
		for(int i=0; i<strs.length; i++) {
			File f = createFile(strs[i]);
			System.out.println(f.getName());
		}
	}
	
	static File createFile(String fileName) {
		try {
			if( fileName == null || fileName.equals("") )
				throw new Exception("파일 이름이 유효하지 않습니다");
		} catch ( Exception e ) {
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			System.out.print("파일생성 -> ");
			f.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}