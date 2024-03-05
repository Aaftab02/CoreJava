package com.edubridge.facadestructuraldesign;

import java.util.Scanner;

public class FranchiseImplementation {

	public static void main(String[] args) {
		System.out.println("Welcome to Registration Service");
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.KFC");
			System.out.println("2.McDonalds");
			System.out.println("3.Dominos");
			System.out.println("4.Exit");
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			FranchiseRegistration f = new FranchiseRegistration();
			switch (choice) {
			case 1: {
				f.buyKFC();
				break;
			}
			case 2:{
				f.buyMcDonalds();
				break;
			}
			case 3:{
				f.buyDominos();
				break;
			}
			case 4:{
				System.out.println("Service Denied");
				break;
			}
			default:
				System.out.println("Wrong choice");
			}
		} while (choice!=4);

	}

}
