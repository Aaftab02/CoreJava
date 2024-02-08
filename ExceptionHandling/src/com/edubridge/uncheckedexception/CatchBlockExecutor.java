package com.edubridge.uncheckedexception;
import java.util.Scanner;

public class CatchBlockExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 45;
		System.out.println("Enter the value of y: ");
		int y =s.nextInt();
		int arr[]= {12,34,56};
		try 
		{
			System.out.println(x/y);
			System.out.println(arr[3]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) 
		{
			if(e1 instanceof ArithmeticException)
				System.out.println(e1);
			else	System.out.println(e1);
		}
		
		finally 
		{
			System.out.println("This is Finally Block");
		}
	
}

}

