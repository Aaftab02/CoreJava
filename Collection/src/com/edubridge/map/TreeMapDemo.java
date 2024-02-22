package com.edubridge.map;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//TreeMap stores key in ascending order
		SortedMap<String,Float>obj=new TreeMap<>();
		obj.put("Ashwin", 77.5f);
		obj.put("Jadeja", 72.5f);
		obj.put("Kuldeep", 88.5f);
		for(Map.Entry<String,Float> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}

	}

}
