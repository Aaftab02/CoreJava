package com.edubridge.factorydesignpattern;

import java.util.Scanner;

public class NetworkPlanImplementation {

	public static void main(String[] args) {
		SelectNetworkPlan s2 = new SelectNetworkPlan();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of network:");
		
		String networkName=sc.next();
		
		System.out.println("Enter the number of minutes:");
		
		int min = sc.nextInt();
		
		CellularPlan p = s2.getPlan(networkName);
		
		System.out.println("Bill amount for "+networkName+" for "+min);
		
		p.getRate();
		
		p.processBill(min);
	}

}
