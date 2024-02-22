package com.edubridge.junitdemo;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestCaseDemo {

	@RepeatedTest(2)
	//It is used to repeat a test for given times
	//@RepeatedTest will run for the number of times mentioned in parenthesis
	void test() {
		for(int i=1;i<=3;i++)
			//i=1-3 and RepeatedTest is 2 = 3*2=6 times
		System.out.println("Edubridge");
	}

}
