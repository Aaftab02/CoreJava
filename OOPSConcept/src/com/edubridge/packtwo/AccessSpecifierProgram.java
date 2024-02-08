package com.edubridge.packtwo;

import com.edubridge.packone.AccessSpecifierDemo;

public class AccessSpecifierProgram {

	public static void main(String[] args) {
		AccessSpecifierDemo obj = new AccessSpecifierDemo();
		/*atm_pinNo is private and we can't access into another class*/
		//obj.atm_pinNo =1234;
		/*displayPinNo() is private and we can't access into another class*/
		//obj.displayPinNo();
		obj.emailId="aaftabkhan@yahoo.com";
		obj.displayEmailId();
		/*percentage is default and can only access inside the same package*/
		//obj.percentage=98.5f;
		/*displayPercentage() is default and can only access inside the same package*/
		//obj.displayPercentage();

	}

}
