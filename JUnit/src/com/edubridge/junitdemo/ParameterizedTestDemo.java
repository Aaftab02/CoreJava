package com.edubridge.junitdemo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//Program to demonstrate on dynamic test
class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings= {"Aaftab","Adil"})
	void display(String word) 
	{
		System.out.println(word);
	}
	
	@ParameterizedTest
	@ValueSource(ints= {67,45,98})
	void accept(int word) 
	{
		System.out.println(word);
	}

}
