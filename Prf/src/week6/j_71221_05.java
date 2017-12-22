package week6;

public class j_71221_05 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch (SpaceException_ e) {
			System.out.println("에러 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간확보후 재시도");
		}catch (MemoryException_ e){
			System.out.println("에러 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("메모리 확보후 재시도");
		}
		
		
	}
	
	static void startInstall() throws SpaceException_, MemoryException_{
		if(!enoughSpace())
			throw new SpaceException_("설치 공간 부족");
		if(!enoughMemory())
			throw new MemoryException_("메모리 부족");
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
}

class SpaceException_ extends Exception{
	public SpaceException_(String s) {
		super(s);
	}
}

class MemoryException_ extends Exception{
	public MemoryException_(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}