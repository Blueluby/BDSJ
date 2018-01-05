package dll;

import java.awt.FileDialog;
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
	
	public boolean ckFile(String Filename) {
		File f = new File(Filename);
		
		if(f.isFile())
			return true;
		else
			return false;
	}
	
	public boolean ckFolder(String folderPath) {
		File fold = new File(folderPath);
		
		if(fold.exists() == false) {
			System.out.println("폴더가 없습니다.");
			fold.mkdir();
			return true;
		}else {
			System.out.println("폴더가 이미 존재함.");
			return false;
			
		}
	}
	
	/*public String selectFile() {
		
		FileDialog fd = new FileDialog("File Select", FileDialog.LOAD);
		fd.setVisible(true);
		
		StringBuilder sb = new StringBuilder();
		sb.append(fd.getDirectory());
		sb.append(fd.getFile());
		return sb.toString();
	}
	*/
	
}
