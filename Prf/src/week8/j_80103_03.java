package week8;

import java.util.Iterator;
import java.util.Map;

public class j_80103_03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread81331 t1 = new Thread81331("Thread1");
		Thread81332 t2 = new Thread81332("Thread2");
		
		t1.start();
		t2.start();
	}
}

class Thread81331 extends Thread{
	
	public Thread81331( String name ) {
		super(name);
	}
	
	public void run() {
		try {
			sleep(5 * 1000);
		} catch (InterruptedException e) {}
	}
}

class Thread81332 extends Thread{
	public Thread81332(String name) {
		super(name);
	}
	
	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x= 0;
		while(it.hasNext()) {
			Object obj = it.next();
			Thread t = (Thread)obj;
			StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));
			
			System.out.println("["+ ++x + "] name : "+ t.getName()+
					", group : " + t.getThreadGroup().getName()+
					", daemon : " + t.isDaemon() );
			
			for(int i = 0 ; i <ste.length; i++) {
				System.out.println(ste[i]);
			}
			
			System.out.println();
		}
	}
}