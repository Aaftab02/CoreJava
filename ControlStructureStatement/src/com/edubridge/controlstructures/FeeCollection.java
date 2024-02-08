package com.edubridge.controlstructures;

import java.util.Scanner;

public class FeeCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentType = new String(sc.next().toUpperCase());
		int tuitionFee = sc.nextInt();
		int busFee = sc.nextInt();
		int hostelFee = sc.nextInt();
		double totalFee;
		switch(studentType)
		{
		case "MSDS": 
			totalFee = tuitionFee + busFee;
			System.out.printf("%.2f",totalFee);
			break;
		case "MSH":
			totalFee = tuitionFee + hostelFee;
			System.out.printf("%.2f",totalFee);
			break;
		case "MGSDS":
			totalFee = 1.50*tuitionFee + busFee;
			System.out.printf("%.2f",totalFee);
			break;
		case "MGSH":
			totalFee = 1.50*tuitionFee + hostelFee;
			System.out.printf("%.2f",totalFee);
			break;
		 default:
			System.out.println("Invalid");
			
		}

	}

}
