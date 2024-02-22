package com.edubridge.interfacedemo.methodreference;
/*Program to demonstrate on reference to a static method*/
public class GossipImplementation {
	
	//static method
	public static void classroomGossip()
	{
		System.out.println("Implementing a Functional Interface");
	}
	public static void main(String[] args) {
		Gossip g = GossipImplementation::classroomGossip;
		g.talk();
	}

}
