package com.edubridge.typesofvariables;

import java.util.Scanner;

public class UnicodeValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int unicode = (int)scan.next().charAt(0);
		System.out.println(unicode);
		scan.close();
	}

}
