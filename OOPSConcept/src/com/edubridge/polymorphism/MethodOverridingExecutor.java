package com.edubridge.polymorphism;
//Program to demonstrate Method Overriding
//Driver Class
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		GoogleMeet g = new GoogleMeet();
		g.accept("Gmeet", "a@gmail.com");
		System.out.println(g instanceof Google);
		

	}

}
