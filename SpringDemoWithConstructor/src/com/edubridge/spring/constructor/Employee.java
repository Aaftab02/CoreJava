package com.edubridge.spring.constructor;

public class Employee {
	
	private int eId;
	private String eName;
	private String EAddress;
	
	public Employee(int eId, String eName, String eAddress) {
		super();
		this.eId = eId;
		this.eName = eName;
		EAddress = eAddress;
	}

	

	public void disp() {
		System.out.println(eId+"\n"+eName+"\n"+EAddress);
	}

	
}
