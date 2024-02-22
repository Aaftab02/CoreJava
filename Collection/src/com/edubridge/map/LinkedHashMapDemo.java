package com.edubridge.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Object>obj=new LinkedHashMap<>();
		obj.put(1, "Aaftab");
		obj.put(5, null);
		obj.put(1, "Adil");
		obj.put(7, "Prince");
		System.out.println(obj);
		//to extract the elements of map
		for(Map.Entry<Integer, Object> itr: obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}	

	}

}