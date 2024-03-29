package com.edubridge.factorydesignpattern;

public abstract class CellularPlan {
	
	double rate;
	
	abstract void getRate();
	
	public void processBill(int min) {
		System.out.println(min*rate);
	}

}
