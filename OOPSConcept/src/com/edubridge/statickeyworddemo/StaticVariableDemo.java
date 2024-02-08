package com.edubridge.statickeyworddemo;
public class StaticVariableDemo {
	//static keyword with variable name
	/*1.When any var name is non-static 
	 * and we are trying to access that variable
	 * inside the main method,then we will get error,so to overcome this error
	 * we have to use static keyword with var name*/
	static float percentage = 89.78f;
	public static void main(String[] args) {
		System.out.println(percentage);

	}

}
