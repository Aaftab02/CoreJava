package com.edubridge.inheritance;
//Child Class
public class Learner extends Trainer {
	
	public String learnerName;
	public int rollNo;
	
	public void display() 
	{
		/*1.super keyword is used to call the function 
		in parent class having same name(display) as child class*/
		super.display();
		System.out.println(learnerName+" "+rollNo);
	}

}
