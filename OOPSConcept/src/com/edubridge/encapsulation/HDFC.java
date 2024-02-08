package com.edubridge.encapsulation;
//Parent Class
public class HDFC {
	//private data members
	private String branch;
	private String IfscCode;
	//getters and setters
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfscCode() {
		return IfscCode;
	}
	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "HDFC [branch=" + branch + ", IfscCode=" + IfscCode + "]";
	}
	

}
