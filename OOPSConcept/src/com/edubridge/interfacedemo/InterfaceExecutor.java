package com.edubridge.interfacedemo;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		// You cannot create an object for interface
		//Cafe c = new Cafe();
		TheVibe t = new TheVibe();
		t.showMenu();
		t.displayPrice();

	}

}
