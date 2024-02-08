package com.edubridge.oops;
//overloading(Compile time/static)-method have same name with different parameters
class Calculation{
	void add(String a,String b) {
		System.out.println("Addition is:"+(a+b));
	}
	void add(int a,int b) {
		System.out.println("Addition is:"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("Addition is:"+(a+b+c));
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		Calculation c1 = new Calculation();
		c1.add(10, 20);
		c1.add("Hello", "World");
		c1.add(10, 20, 30);
	}

}
