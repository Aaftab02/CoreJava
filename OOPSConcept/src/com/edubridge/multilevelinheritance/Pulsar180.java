package com.edubridge.multilevelinheritance;
//derived class1
//parent class2
public class Pulsar180 extends Pulsar {
	
	public int speed;
	public int price;
	public Pulsar180(int speed, int price) {
		/*2.Super keyword is used to call parent class constructor*/
		super(speed, price);
		this.speed = speed;
		this.price = price;
		/*3.If parent class and child class have same variable name and if we want to invoke 
		 * parent class variable inside child class then we have to use super.varname;*/
		super.price=130000;
		super.speed=60;
	}
	@Override
	public String toString() {
		return "Pulsar180 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	

}
