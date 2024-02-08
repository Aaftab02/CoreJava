package com.edubridge.polymorphism;
//Program to demonstrate method overloading
class Stocks
{
	String shareName;
	long sharePrice;
	String shareType;
	
	//Method Overloading
	public static void displayStockDetails(String shareName,long sharePrice)
	{
		System.out.println(shareName+" "+sharePrice);
	}
	public static void displayStockDetails(String shareName,String shareType)
	{
		System.out.println(shareName+" "+shareType);
	}
}
//Driver Class
public class MethodOverloading {

	public static void main(String[] args) {
		Stocks.displayStockDetails("TATA Power", 975);
		Stocks.displayStockDetails("TATA Power", "Nifty-Fifty");

	}

}
