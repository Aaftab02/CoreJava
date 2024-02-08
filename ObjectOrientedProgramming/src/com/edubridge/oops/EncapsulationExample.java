package com.edubridge.oops;

class Whatsapp{
	private String personName;
	private String status;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		Whatsapp w1 = new Whatsapp();
		w1.setPersonName("Aaftab");
		w1.setStatus("Visible");
		System.out.println(w1.getPersonName());
		System.out.println(w1.getStatus());

	}

}
