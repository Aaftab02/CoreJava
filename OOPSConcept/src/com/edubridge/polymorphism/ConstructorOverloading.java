package com.edubridge.polymorphism;
//Program to demonstrate constructor overloading
class Renault
{
	String carName;
	int noOfSeater;
	String color;
	String engine;
	float price;
	
	//constructor overloading
	Renault(String carName,String color,int noOfSeater)
	{
		this.carName=carName;
		this.color=color;
		this.noOfSeater=noOfSeater;
		System.out.println(carName+" "+color+" "+noOfSeater);
	}
	Renault(String carName,String engine,float price)
	{
		this.carName=carName;
		this.engine=engine;
		this.price=price;
		System.out.println(carName+" "+engine+" "+price);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Renault r = new Renault("RXE", "Yellow", 6);
		Renault r2 = new Renault("Duster", "CNG",850000f);
		

	}

}
