package com.edubridge.assignmentproblems;

import java.util.Scanner;

public class NumberPatternThree {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i =n;i>0;i--) {
				for(int j=i;j>0;j--) 
				{
					System.out.print(2*(n-j)+1);
				}
				System.out.println(" ");
			}

		}

	}
