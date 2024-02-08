package com.edubridge.operators;
//program to demonstrate increment and decrement operator
public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		int a=6,b=3;
		@SuppressWarnings("unused")
		int res=a++ - ++b; //2
		@SuppressWarnings("unused")
		int res2= --a + b--; //10
		System.out.println(a); //6
		System.out.println(b); //3
	}

}
