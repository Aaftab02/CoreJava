package com.edubridge.stringdemo;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1="Aaftab Khan";
		String str2="";
		System.out.println(str1.length());
		//to convert a string into character array
		char[] arr=new char[11];
		str1.getChars(0,11,arr,0);
		System.out.println(Arrays.toString(arr));
		System.out.println(str1.compareTo("aaftab khAn"));
		System.out.println(str1.compareTo("Aaftab Khan"));
		System.out.println(str1.compareToIgnoreCase("aaftab khAn"));
		System.out.println(str2.isEmpty()); //true
		System.out.println(str2.isBlank());
		System.out.println(str1.charAt(4));
		System.out.println("Hey Guy's, you are awesome".startsWith("He"));
		System.out.println("Hey Guy's, you are awesome".endsWith("some"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println( "Karan Luthra ".trim());
		System.out.println( "Karan Luthra ".strip());
		System.out.println("JAVA".repeat(2));
		
	}

}
