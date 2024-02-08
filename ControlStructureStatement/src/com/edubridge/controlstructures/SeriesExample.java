package com.edubridge.controlstructures;

import java.util.Scanner;

public class SeriesExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=6;
		for(int i=0;i<n;i++)
		{
			sum = sum+5*i;
			System.out.print(sum+" ");
		}

	}

}
