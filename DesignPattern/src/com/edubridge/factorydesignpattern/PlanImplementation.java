package com.edubridge.factorydesignpattern;

class BOI implements Plan{

	@Override
	public void getRoi(double rate) {
		System.out.println("The Rate of Interest for BOI is: "+rate+"%");
		
	}
	
}

class SBI implements Plan{

	@Override
	public void getRoi(double rate) {
		System.out.println("The Rate of Interest for SBI is: "+rate+"%");
		
	}
	
}

class BOB implements Plan{

	@Override
	public void getRoi(double rate) {
		System.out.println("The Rate of Interest for BOB is: "+rate+"%");
		
	}
	
}

public class PlanImplementation {

	public static void main(String[] args) {
		
		BOI b1 = new BOI();
		b1.getRoi(8.2);
		SBI s1 = new SBI();
		s1.getRoi(7.5);
		BOB b2 = new BOB();
		b2.getRoi(6.7);

	}

}
