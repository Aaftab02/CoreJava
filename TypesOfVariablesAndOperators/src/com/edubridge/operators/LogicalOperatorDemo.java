package com.edubridge.operators;
//program to demonstrate Logical Operators
import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a==3 && b>a));
		System.out.println((a==3 || b>a));
		System.out.println(!(a<=b));

	}

}
