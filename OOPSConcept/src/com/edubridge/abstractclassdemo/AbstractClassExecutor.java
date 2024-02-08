package com.edubridge.abstractclassdemo;
//Program to demonstrate Abstract class
import java.util.Scanner;
public class AbstractClassExecutor {

	public static void main(String[] args) {
		/*We can't create the object for abstract class*/
		//GovernmentAgency a = new GovernmentAgency();
		ISRO i = new ISRO();
		Scanner s = new Scanner(System.in);
		System.out.println(i.display());
		i.displayDetails();
		i.setAgencyName("ISRO");
		i.setBudget(5678900);
		System.out.println(i);
		System.out.println("Enter the input: ");
		i.displayDetails(s.next(), s.nextLong());

	}

}
