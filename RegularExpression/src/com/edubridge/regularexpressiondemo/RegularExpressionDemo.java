package com.edubridge.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	
	public static void main(String args[])
	{
	String input = "TV price is 500 Rs";
	String regex="(.*)(\\d+)(.*)";
	//String regex =".*s";
	
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(input);
	System.out.println(m.matches());
	}
}
