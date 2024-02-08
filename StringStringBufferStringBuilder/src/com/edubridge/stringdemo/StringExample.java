package com.edubridge.stringdemo;
//program to demonstrate how to create a string
public class StringExample {

	public static void main(String[] args) {
		//1.By using string literal
		String str1="Edubridge";
		String str2="Edubridge";
		//2.By using new keyword
		String str3=new String("edubridge");
		String str4=new String("Edubridge");
		System.out.println(str1==str2); //true
		System.out.println(str1==str4); //false
		System.out.println(str3==str4); //false
		System.out.println(str1.equals(str3)); //false
		System.out.println(str1.equals(str4)); //true
	}

}
