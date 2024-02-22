package com.edubridge.synchronization;

public class MyThread extends Thread {
	
	Welcome w;

	public MyThread(Welcome w) {
		super();
		this.w = w;
	}
	//object reference of class Welcome is used for constructor only
	//and it can't be used to access the method of the class as method is static
	
	public void run()
	{
		//to access static method use ClassName.methodname();
		Welcome.display(getName());
	}

}
