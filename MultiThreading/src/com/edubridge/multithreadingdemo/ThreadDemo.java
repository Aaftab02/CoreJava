package com.edubridge.multithreadingdemo;
//1.Creating a thread by extending Thread Class
public class ThreadDemo extends Thread {
	
	public void run()
	{
		/*CurrentThread() method will give a current 
		  executing Thread name*/
		System.out.println("Thread is in running state: "+Thread.currentThread());
	}

	public static void main(String[] args) {
		
		for(int i=1;i<4;i++)
		{
			ThreadDemo t1 = new ThreadDemo();
			ThreadDemo t2 = new ThreadDemo();
			/*When we call start() method,automatically it calls to the run() method */
			t1.start();
			t2.start();
			//System.out.println(t1.getName()+" "+t2.getName());
		}
		
		

	}

}
