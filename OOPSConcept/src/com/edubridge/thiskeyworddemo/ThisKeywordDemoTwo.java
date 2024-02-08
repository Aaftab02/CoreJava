package com.edubridge.thiskeyworddemo;
/*This keyword is used to pass parameter inside the method call*/

public class ThisKeywordDemoTwo {

	void printOne(ThisKeywordDemoTwo obj) 
	{
		System.out.println("Welcome to Edubridge");
	}
	void printTwo() 
	{
		//method call
		printOne(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemoTwo obj = new ThisKeywordDemoTwo();
		obj.printTwo();

	}

}
