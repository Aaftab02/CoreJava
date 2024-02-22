package com.edubridge.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();
		obj.put(1, "Aaftab");
		obj.put(2, "Addy");
		obj.put(1, "Adil");
		obj.put(1, "Prince");
		System.out.println(obj);
		System.out.println(obj.containsKey(5));
		obj.remove(1);
		//it removes entire entries of key 1
		//obj.remove(1, "Prince");
		System.out.println(obj);
		

	}

}
