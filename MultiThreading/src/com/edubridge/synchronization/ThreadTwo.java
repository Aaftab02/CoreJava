package com.edubridge.synchronization;
//Thread 2
public class ThreadTwo extends Thread {
	
	/*reference object of SynchronizedMethod class
	 * to access print() method*/
	SynchronizedMethod m2;

	public ThreadTwo(SynchronizedMethod m2) {
		super();
		this.m2 = m2;
	}
	
	public void run() {
		m2.print(5);
	}

}
