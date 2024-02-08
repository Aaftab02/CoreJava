package com.edubridge.assignmentproblems;

import java.util.Scanner;

public class SearchingAnElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int flag =0;//false
		int arr[] = new int[n];
		System.out.println("Array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Element to be searched:");
		int a = sc.nextInt();
		//Logic
		for(int i=0;i<n;i++) {
			if(arr[i] == a)
				flag=1;
		}
		if(flag==1)
			System.out.println(a+" is present in the array");
		else
			System.out.println("Not Found");
	}
}

