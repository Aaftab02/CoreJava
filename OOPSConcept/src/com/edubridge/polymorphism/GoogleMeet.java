package com.edubridge.polymorphism;
//Child Class 
public class GoogleMeet extends Google {
	String appName;
	String emailId;
	
	public void accept(String appName,String emailId)
	{
		super.accept("Google", "google@gmail.com");
		System.out.println(appName+" "+emailId);
	}

}
