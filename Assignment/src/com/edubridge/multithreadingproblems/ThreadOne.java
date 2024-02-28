package com.edubridge.multithreadingproblems;

public class ThreadOne extends Thread {
	
	int repetition;
	
	public ThreadOne(int repetition) {
		super();
		this.repetition = repetition;
	}
	
	public void run()
	{
		int count =0;
		for(int i=repetition;i>=0;i--)
		{	
			System.out.println("Thread one is running "+count+" time");
			count++;
		}
	}
	
	

}
