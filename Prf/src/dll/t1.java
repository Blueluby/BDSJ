package dll;

public class t1 {
	
	public long startTime;
	public long endTime;
	
	public t1() {
		startTime = System.currentTimeMillis();
	}
	public String bracket(String s) {
		String str = "";
		str = "["+s+"] ";
		return str;
	}
	public String bracket(int i) {
		String str = "";
		str = "["+i+"] ";
		return str;
	}
	
	public String bracketln(String s) {
		String str = "";
		str = "["+s+"] ";
		return str;
	}
	public String bracketln(int i) {
		String str = "";
		str = "["+i+"]";
		return str;
	}
	
	public void endTimeCk() {
		endTime = System.currentTimeMillis();
	}
	
	public void showCktime() {
		long lTime = endTime - startTime;
		System.out.println("TIME : " + lTime + "(ms)");
	}
}