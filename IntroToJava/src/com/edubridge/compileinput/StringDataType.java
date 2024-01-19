package com.edubridge.compileinput;

import java.util.Scanner;

public class StringDataType {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char c=s.next().charAt(0);
		boolean res=false;
		System.out.println(str);
		System.out.println(c);
		System.out.println(res);
		s.close();
	}

}
