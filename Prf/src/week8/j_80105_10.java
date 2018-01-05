package week8;

import java.io.File;
import java.io.IOException;

public class j_80105_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=  new File("D://Developers//WorkingSpace//Eclipse//blueluby//Prf//src/week8//j_80105_10.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로제외 파일이름 - "+f.getName());
		System.out.println("확장자 제외 파일이름  - "+fileName.substring(0, pos));
		System.out.println("확장자 - "+fileName.substring(pos+1));
		System.out.println("경로를 포함한 파일이름 - "+f.getPath());
		System.out.println("파일의 정규경로 - "+f.getCanonicalPath());
		System.out.println();
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar - "+File.pathSeparatorChar);
		System.out.println("File.separator - "+File.separator);
		System.out.println("File.separatorChar - "+File.separatorChar);
		System.out.println();
		System.out.println("user.dir="+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = "+System.getProperty("sun.boot.class.path"));
		
	}

}
