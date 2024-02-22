package com.edubridge.junitdemo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JunitAnnotationDemo {

	@Test
	void test() {
		System.out.println("Test method");
	}
	
	/*@BeforeEach is executed first before each test method*/
	@BeforeEach
	//@AfterEach is executed after each test method
	void accept() {
		System.out.println("beforeEach method");
	}
	
	@Test
	//@Disabled is used to hide or disable the method and it will not be executed
	@Disabled
	void display() {
		System.out.println("New Test method");
	}
	
	/*AfterAll is used to execute a statement after all test methods
	 * only once at the end*/
	//method in @afterAll should be declared as static
	@AfterAll
	static void play() {
		System.out.println("JUnit plays...");
	}

}
