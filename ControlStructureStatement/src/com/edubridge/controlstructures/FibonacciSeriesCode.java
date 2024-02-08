package com.edubridge.controlstructures;

import java.util.Scanner;

public class FibonacciSeriesCode {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int a=0,b=1,c;
		System.out.println("The elements of Fibonacci Series are:");
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			c =a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
