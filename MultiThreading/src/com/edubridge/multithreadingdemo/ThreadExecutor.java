package com.edubridge.multithreadingdemo;
//2.Create a thread by implementing a runnable interface
public class ThreadExecutor implements Runnable {
	
	@Override
	public void run() {
		for(int i =0;i<3;i++)
		{
			System.out.println("Thread "+i+" "+Thread.currentThread());
		}
		
	}

	public static void main(String[] args) {
		ThreadExecutor t1 = new ThreadExecutor();
		//t1.start();
		t1.run();

	}

	

}
