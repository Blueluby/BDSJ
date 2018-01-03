package week8;

public class j_80103_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("group1");
		ThreadGroup grp2 = new ThreadGroup("group2");
		
		ThreadGroup sgrp = new ThreadGroup(grp1,"subgroup");
		
		grp1.setMaxPriority(3);
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		};
		
		Thread th1 = new Thread(grp1, r, "th1");
		Thread th2 = new Thread(sgrp, r, "th2");
		Thread th3 = new Thread(grp2, r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(">> List of thread group : " + main.getName() +
				", Active ThreadGroup : "+main.activeGroupCount()+
				", Active Thread : "+main.activeCount());
		
		main.list();
		
		
		
	}

}
