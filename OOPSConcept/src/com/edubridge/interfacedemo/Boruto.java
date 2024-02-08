package com.edubridge.interfacedemo;
//child class
public class Boruto implements Naruto,Hinata {

	@Override
	public void powerOne(int noofchildren, String clan) {
		System.out.println(noofchildren+" "+clan);
	}

	@Override
	public void power(int noofchildren, String position) {
		System.out.println(noofchildren+" "+position);
		
	}

}
