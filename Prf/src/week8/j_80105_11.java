package week8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class j_80105_11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		fileMove();
		
		dirCtr(args);
	}
	
	public static void BufferedTest() throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		
		out.write("박지성 - 지성지성");
		out.newLine();
		out.write("박지성 - 지성지성");
		out.newLine();
		
		out.close();
	}
	
	public static void fileMove() {
		
		File myFile = new File("D:\\Developers\\WorkingSpace\\Eclipse\\test\\t1\\my.txt");
		
		if(myFile.exists() == false) {
			System.out.println("원본 파일이 준비되어있지 않습니다");
			return;
		}
		
		File reDir = new File("D:\\Developers\\WorkingSpace\\Eclipse\\test\\t2");
		reDir.mkdir();
		
		File reFile = new File(reDir, "my.txt");
		myFile.renameTo(reFile);
		
		if(reFile.exists() == true)
			System.out.println("이동성공");
		else
			System.out.println("이동실패");
		
	}
	
	static int totalfiles = 0;
	static int totaldirs = 0;
	
	public static void dirCtr(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java. file. directory");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지않음");
			System.exit(0);
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("총 "+totaldirs + "개의 폴더");
		System.out.println("총 "+totalfiles + "개의 파일");
	}
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + "디렉토리");
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for(int i=0; i<files.length; i++) {
			String filename = files[i].getName();
			
			if(files[i].isDirectory()) {
				filename = "["+filename+"]";
				subDir.add(i+"");
			}
			System.out.println(filename);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalfiles += fileNum;
		totaldirs += dirNum;
		
		System.out.println(fileNum + "개의 파일 "+dirNum+"개의 폴더");
		System.out.println();
		
		for(int i=0; i<subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);	//하위까지 털기(재귀)
		}
		
	}

}
