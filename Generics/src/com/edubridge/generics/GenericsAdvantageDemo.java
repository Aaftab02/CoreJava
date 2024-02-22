package com.edubridge.generics;
import java.util.ArrayList;
import java.util.List;
//Program to demonstrate on generics advantage
public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		//1.Type Safety
		//List obj = new ArrayList<>();
		List<String> obj = new ArrayList<>();
		//it ensures that to add only String values
		//3.Compile time checking
		//obj.add(11);
		obj.add("11");
		obj.add("Aaftab");
		
		//2.Type-casting is not required
		//List obj1 = new ArrayList<>();
		List<String> obj1 = new ArrayList<>();
		obj1.add("Aaftab");
		obj1.add("Adil");
		//Without generics,typecasting is required
		//String str1=(String) obj1.get(0);
		String str1=obj1.get(1); //Adil
		System.out.println(str1);

	}

}
