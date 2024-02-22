package com.edubridge.typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit or widening typecasting
		//smaller to larger data type size
		char c ='b';
		int num=c;
		System.out.println(num);
		
		//explicit or narrowing typecasting
		//larger to smaller data type size
		int num1=15;
		char x=(char) num1;
		System.out.println(x);

	}

}
