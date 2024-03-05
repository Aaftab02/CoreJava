package com.edubridge.facadestructuraldesign;

public class KFC implements Franchise {

	@Override
	public void option() {
		System.out.println("KFC");
		
	}

	@Override
	public void cost() {
		System.out.println("80,000Rs");
		
	}

}
