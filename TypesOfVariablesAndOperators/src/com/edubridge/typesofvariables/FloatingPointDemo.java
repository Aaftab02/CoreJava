package com.edubridge.typesofvariables;

import java.util.Scanner;

public class FloatingPointDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float testFloat = scan.nextFloat();
		System.out.printf("%.2f",testFloat);
		scan.close();
	}

}
