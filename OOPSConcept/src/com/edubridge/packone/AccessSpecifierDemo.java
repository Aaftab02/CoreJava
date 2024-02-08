package com.edubridge.packone;
/*program to demonstrate public, private and default access specifier*/
public class AccessSpecifierDemo {

	//private variable
	private int atm_pinNo;
	public String emailId;
	float percentage;
	
	//private method
	private void displayPinNo() {
		System.out.println(atm_pinNo);
	}
	public void displayEmailId() {
		System.out.println(emailId);
	}
	void displayPercentage() {
		System.out.println(percentage);
	}

}
