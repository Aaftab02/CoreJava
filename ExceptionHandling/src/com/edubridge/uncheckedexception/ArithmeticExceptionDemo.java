package com.edubridge.uncheckedexception;
import java.util.Scanner;
//program to demonstrate on Arithmetic Exception
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 15;
		System.out.println("Enter the value of y: ");
		int y =s.nextInt();
		
		try
		{
			System.out.println(x/y);
			/*1.When we use System.exit(0) inside a try block after an exception
			 * is thrown also inside a catch block after printing statement then 
			 * finally block is not executed */
			//System.exit(0);
		}
		/*In parenthesis of catch mention Exception(parent) class or child 
		class name with object(any object)*/
		catch(ArithmeticException e) 
		{
			System.out.println("Exception Occured "+e);
			//System.exit(0);
		}
		finally
		{
			//System.exit(0);
			/*When we throw an exception inside a finally block before
			 * printing the statement*/
			//System.out.println(12/0);
			System.out.println("Finally Block");
		}
		s.close();

	}

}
