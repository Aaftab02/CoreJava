package com.edubridge.junitdemo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//Program to demonstrate on simple Test case using JUnit5
class SimpleJunitTestDemo {
	/*@Test annotation ensures that to perform unit testing on the 
	 * given block of code*/
	@Test
	//@DisplayName annotation is used to show a new name of the method
	@DisplayName("displayOutput")
	void test() {
		int a=10,b=14;
		
		//int a,b;
		/*The above line will show that the test case failed as value of local variable is
		  not initialized */
		System.out.println("addition is:"+a+b);
	}

}
