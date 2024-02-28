package com.edubridge.multithreadingproblems;

public class ThreadExecution {

	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne(5);
		ThreadTwo t2 = new ThreadTwo(7);
		t1.start();
		t2.start();

	}

}
