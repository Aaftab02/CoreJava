package com.edubridge.runtimearray;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		int arr[]=new int[n];
		int max =arr[0];
		//for storing elements of array
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		//for displaying the array
		System.out.println("The elements of the array are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//for finding the largest number in the array
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The largest element is: "+max);
			
		}

	}

