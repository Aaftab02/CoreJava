package com.edubridge.operators;
//program to demonstrate Assignment Operator
import java.util.Scanner;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);

	}

}
