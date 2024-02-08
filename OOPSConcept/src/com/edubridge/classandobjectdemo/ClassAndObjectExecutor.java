package com.edubridge.classandobjectdemo;
/*program to demonstrate class and objects*/
class Vegetables
{
	//variable or fields
	String vegetableName;
	int price;
	
	//methods
	void print() 
	{
		System.out.println("Vegetable name: "+vegetableName+" "+"Price is:"+price);
	}
}

//Driver Class-As it contains main method
public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		Vegetables v = new Vegetables();
		v.vegetableName="JackFruit";
		v.price=80;
		v.print();

	}

}
