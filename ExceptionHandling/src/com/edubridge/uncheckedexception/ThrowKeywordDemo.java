package com.edubridge.uncheckedexception;
import java.io.IOException;
import java.util.Scanner;

//Program to demonstrate on Throw and Throws keyword
public class ThrowKeywordDemo {
	/*Throws keyword is used to declare an exception and to handle
	 * a checked exception*/
	public static void donate(int age,int weight) throws IOException
	{
		if(age>18 && weight>45) 
			System.out.println("Eligible to donate the blood");
		else
			/*throw keyword is used to throw an exception explicitly*/
			throw new IOException("Not Eligible");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		try {
			ThrowKeywordDemo.donate(age, weight);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
