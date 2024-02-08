package com.edubridge.assignmentproblems;

import java.util.Scanner;

public class RemoveOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str=str.replaceAll("the ", "");
		str=str.substring(0, str.length());
		System.out.println(str);

	}

}
