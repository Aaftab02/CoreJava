package com.edubridge.encapsulation;
//Child Class
public class Customer extends HDFC {
	private String custName;
	private long custId;
	private int pinNo;
	
	//getters and setters
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custId=" + custId + ", pinNo=" + pinNo + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
