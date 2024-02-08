package com.edubridge.encapsulation;
/*Program to demonstrate Encapsulation*/
public class EncapsulationDemo {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setBranch("Thane");
		c.setIfscCode("HDFC120078");
		c.setCustName("Aaftab Khan");
		c.setCustId(1034);
		c.setPinNo(4433);
		System.out.println(c.getBranch());
		System.out.println(c);

	}

}
