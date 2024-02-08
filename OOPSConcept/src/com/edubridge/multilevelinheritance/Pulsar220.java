package com.edubridge.multilevelinheritance;
//child class
public class Pulsar220 extends Pulsar180 {
	
	public int speed;
	public int price;
	
	public Pulsar220(int speed, int price) {
		/*2.Super keyword is used to call parent class constructor*/
		super(speed, price);
		this.speed = speed;
		this.price = price;
		/*3.If parent class and child class have same variable name and if we want to invoke 
		 * parent class variable inside child class then we have to use super.varname;*/
		super.price=150000;
		super.speed=85;
	}

	@Override
	public String toString() {
		return "Pulsar220 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	

}
