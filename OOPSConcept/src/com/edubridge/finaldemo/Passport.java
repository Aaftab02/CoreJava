package com.edubridge.finaldemo;
//Child Class
/*We can't inherit the final class */
public class Passport extends Card {
	private final String passportNo="IND76656751";
	private String dateOfExpiry;
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getPassportNo() {
		return passportNo;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", dateOfExpiry=" + dateOfExpiry + ", toString()="
				+ super.toString() + "]";
	}
	//we can't override final method
	/*final void accept() 
	{
		System.out.println("This is Final Method");
	}*/
	

}
