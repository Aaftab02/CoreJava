package com.edubridge.factorydesignpattern;

public class SelectNetworkPlan {
	public CellularPlan getPlan(String planType) {
		
		if(planType==null) {
			return null;
		}
		else if (planType.equalsIgnoreCase("abcNetwork")) {
			return new abcNetwork();
		}
		else if (planType.equalsIgnoreCase("xyzNetwork")) {
			return new xyzNetwork();
		}
		return null;	
	}

}
