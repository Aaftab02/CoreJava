package com.edubridge.synchronization;
//Program to demonstrate on synchronized method
public class SynchronizedMethodExecutor {

	public static void main(String[] args) {
		SynchronizedMethod m = new SynchronizedMethod();
		ThreadOne t1 = new ThreadOne(m);
		ThreadTwo t2 = new ThreadTwo(m);
		t1.start();
		t2.start();

	}

}
