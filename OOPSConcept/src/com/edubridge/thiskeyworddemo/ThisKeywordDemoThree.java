package com.edubridge.thiskeyworddemo;
/*this keyword is used to invoke current class constructor*/
public class ThisKeywordDemoThree {

	public int x;
	ThisKeywordDemoThree()
	{
		/*this keyword is calling the parameterized constructor*/
		this(12);
		System.out.println("Non-Parameterized Constructor");
	}
	ThisKeywordDemoThree(int x)
	{
		System.out.println("Parameterized Constructor"+x);
	}
	public static void main(String[] args) {
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();

	}

}
