package com.edubridge.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
//Program to demonstrate on Set
public class SetDemo {

	public static void main(String[] args) {
		//Hash Set stores data in random/unordered manner
		Set<String>obj=new HashSet<>();
		obj.add("Akshay");
		obj.add("Abhishek");
		obj.add("Aftab");
		obj.add("Atul");
		System.out.println(obj);
		
		//LinkedHashSet stores data in the insertion order
		Set<String>obj1=new LinkedHashSet<>();
		obj1.add("Akshay");
		obj1.add("Abhishek");
		obj1.add("Aftab");
		obj1.add("Atul");
		System.out.println(obj1);
		
		//TreeSet stored data in ascending/ordered manner
		SortedSet<String>obj2=new TreeSet<>();
		obj2.add("Akshay");
		obj2.add("Abhishek");
		obj2.add("Aftab");
		obj2.add("Atul");
		System.out.println(obj2);
		

	}

}
