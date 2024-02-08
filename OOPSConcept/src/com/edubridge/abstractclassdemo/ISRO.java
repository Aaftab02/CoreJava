package com.edubridge.abstractclassdemo;
//implementable class or child class
public class ISRO extends GovernmentAgency {

	/*implement all the abstract methods of parent class */
	@Override
	void displayDetails() {
		System.out.println("Indian Space Reaseach Organization");
		
	}

	@Override
	void displayDetails(String agencyName, long budget) {
		System.out.println("agency name and"+" "+"budget is: "+ agencyName +" "+budget );
		
	}

}
