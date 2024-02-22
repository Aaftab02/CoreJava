package com.edubridge.junitdemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionDemo {

	@Test
	@DisplayName("AssertTrue")
	void test() {
		//if expression is true then it passes else fails
		assertTrue(12<=4);
		
		//if expression is false then it passes else fails
		//assertFalse(12<=4);
		
	}
	
	@Test
	void accept() {
		/*if expected and actual value are same then it 
		 * will pass else fails*/
		assertEquals(12,5);	
		
	}
	
	@Test
	void display() {
		/*if expression value is not null then it 
		 * will pass else fails*/
		assertNotNull(12);	
		
	}	

}
