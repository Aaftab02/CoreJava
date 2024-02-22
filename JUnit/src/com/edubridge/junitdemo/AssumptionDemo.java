package com.edubridge.junitdemo;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.getProperty("Shiwani", "Shiwani");
		Assumptions.assumeTrue("Shiwani".equals(System.getProperty("Shiwani")));
	}
	
	@Test
	void testOne() {
		System.getProperty("Shiwani", "Shiwani");
		Assumptions.assumeFalse("Shivani".equals(System.getProperty("Shivani")));
	}
	
	@Test
	void testTwo() {
		int x=10,y=10;
		Assumptions.assumingThat(x==y, ()->{
			System.out.println("Assuming That.....");
		});
		System.out.println("");
	}

}
