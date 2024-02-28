package com.edubridge.multithreadingproblems;

public class ThreadTwo extends Thread {
	int repetition;
	
	public ThreadTwo(int repetition) {
		super();
		this.repetition = repetition;
	}
	
	public void run()
	{
		int count = 0;
		for(int i=repetition;i>=0;i--)
		{
			System.out.println("Thread two is running "+count+" time");
			count++;
		}
	}
	
}
