package com.edubridge.facadestructuraldesign;

public class McDonalds implements Franchise{

	@Override
	public void option() {
		System.out.println("McDonalds");
		
	}

	@Override
	public void cost() {
		System.out.println("1,00,000RS");
		
	}

}
