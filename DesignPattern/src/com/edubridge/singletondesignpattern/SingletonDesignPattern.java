package com.edubridge.singletondesignpattern;

import java.sql.SQLException;
import java.util.Scanner;

public class SingletonDesignPattern {

	public static void main(String[] args) throws SQLException {
		System.out.println("Singleton Creational Design Pattern");
		Scanner sc = new Scanner(System.in);
		
		JDBCSingleton jdbc = JDBCSingleton.getInstance();
		
		int choice =0;
		do {
			System.out.println("1.Insert");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter your Name: ");
				String uname = sc.next();
				
				System.out.println("Enter your Password: ");
				String upass = sc.next();
				
				System.out.println("Enter your Employee Id: ");
				int eid = sc.nextInt();
				int i = jdbc.insert(uname, upass, eid);
				if(i>0) {
					System.out.println("Data inserted successfully");
				}
				else {
					System.out.println("Data is not inserted");
				}
				break;
			}
			case 2: {
				jdbc.view();
				break;
			}
			case 3: {
				System.out.println("Enter the Id which you want to update:");
				int id = sc.nextInt();
				
				System.out.println("Enter the username which you want to update:");
				String uname1 = sc.next();
				
				System.out.println("Enter the password which you want to update:");
				String pass = sc.next();
				
				int i1 = jdbc.update(id, uname1, pass);
				if(i1>0) {
					System.out.println("Data updated successfully");
				}
				else {
					System.out.println("Data not updated");	
				}
				break;
			}
			case 4: {
				System.out.println("Which Id you want to delete");
				int id2=sc.nextInt();
				jdbc.delete(id2);
				System.out.println("Id deleted successfully");
				break;
			}
			case 5: {
				System.out.println("Bye");
				break;
			}
			default:
				System.out.println("Wrong Choice");
			}
		} while (choice!=5);

	}

}
