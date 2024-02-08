package com.edubridge.interfacedemo;
//interface
public interface Cafe {
	/*All the fields inside an interface are by default, public static final*/
	String menu = "Pav Bhaji";
	int price = 90;
	
	/*All the methods inside an interface are by default public abstract*/
	void showMenu();
	void displayPrice();

}
