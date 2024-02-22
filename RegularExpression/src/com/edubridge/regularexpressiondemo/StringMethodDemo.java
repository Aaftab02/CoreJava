package com.edubridge.regularexpressiondemo;
//Program to demonstrate on split() and replaceAll() method of String
public class StringMethodDemo {

	public static void main(String[] args) {
		String str = "I,have,a,strong,feeling,for,you";
		String[] res = str.split(",");
		for(String itr:res)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		String str1 = "There are 7 members in my family";
		String regex = "\\d+";
		String res1 = str1.replaceAll(regex, "seven");
		System.out.println(res1);

	}

}
