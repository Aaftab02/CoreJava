package com.edubridge.oops;

class Bank{
	String bankName = "Bank of India";
	String address = "Mumbai";
	String emailId = "boi@gmail.com";
}

class Facility extends Bank{
	float roi = 8.5f;
	void show() {
		System.out.println("Bank name is:"+bankName+"\nRate of interest:"+roi);
	}
}

class Info extends Bank{
	void show1(){
		System.out.println("Bank name is:"+bankName+"\nBank address is:"+address+"\nEmail Id is:"+emailId);
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Facility f1 = new Facility();
		Info i1 = new Info();
		f1.show();
		i1.show1();

	}

}
