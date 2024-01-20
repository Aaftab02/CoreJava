package com.edubridge.operators;
//program to demonstrate Relational Operators
import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);

	}

}
