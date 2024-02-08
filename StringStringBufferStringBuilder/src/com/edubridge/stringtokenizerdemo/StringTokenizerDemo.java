package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer t = new StringTokenizer(""+"Hey there, I am using String Tokens");
		System.out.println(t.countTokens());
		System.out.println(t.nextToken());
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		StringTokenizer t1 = new StringTokenizer("Edu-Bridge-India","-",false); 
		/* syntax is (String,delimiter,true/false)-if the 3rd argument is true we'll get the 
		delimiters in output along with tokens and if false, delimiters are ignored  */
		while(t1.hasMoreTokens()) {
			System.out.println(t1.nextToken());
		}
	}
}
