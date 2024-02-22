package com.edubridge.mockitodemo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockitoWithJunitDemo {
	/*Dependency Injection in the form of objects*/
	private Calculator cal;
	/*For checking the condition in the main Testing class 
	 * using mock method*/
	@BeforeEach
	void setDemo()
	{
		cal=mock(Calculator.class);
		when(cal.addition(1, 1)).thenReturn(2);
		when(cal.substraction(2, 2)).thenReturn(0);
	}
	
	@Test
	void testAddition() 
	{
		Assertions.assertEquals(2,cal.addition(1, 1));
		verify(cal).addition(1, 1);
	}
	
	@Test
	void testSubstraction() 
	{
		Assertions.assertEquals(0,cal.substraction(2, 2));
		verify(cal).substraction(2, 2);
	}

}
