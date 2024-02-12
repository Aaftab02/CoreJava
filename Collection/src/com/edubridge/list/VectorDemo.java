package com.edubridge.list;
import java.util.List;
import java.util.Vector;
//Program to demonstrate on Vector
public class VectorDemo {

	public static void main(String[] args) {
		List<Object>obj=new Vector<>();
		obj.add(12);
		obj.add("Aaftab");
		obj.add(76000.6);
		obj.add('Z');
		obj.add(true);
		System.out.println(obj);

	}

}
