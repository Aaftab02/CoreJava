package com.edubridge.map;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		/*HashMap keys are arrange in ascending order and
		 * HashTable keys are arrange in descending order*/
		Map<Integer,Object>obj=new Hashtable<>();
		obj.put(1, "Aaftab");
		obj.put(7, "Prince");
		obj.put(5, "Adil");
		//We can't use key and value as 'null' else we will get null pointer exception
		//obj.put(5, null);
		System.out.println(obj);
	}

}
