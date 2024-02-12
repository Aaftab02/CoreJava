package com.edubridge.list;
import java.util.ArrayList;
import java.util.List;
//import java.util.Collection;
//Program to demonstrate on Array List
public class ArrayListDemo {

	public static void main(String[] args) {
		/*We can't create the object for Collection interface*/
		//Collection<Integer>obj=new Collection<>();
		List<String>obj=new ArrayList<>();
		obj.add("Aaftab");
		obj.add("Alam");
		obj.add("Khan");
		System.out.println(obj);
		/*When we want to create an arraylist for multiple datatype,
		 *we write 'Object' as wrapper class object type*/ 
		List<Object>obj1=new ArrayList<>();
		obj1.add("Aaftab");
		obj1.add(101);
		obj1.add(76.4);
		System.out.println(obj1);
		List<String>obj2=new ArrayList<>();
		obj2.addAll(obj);
		System.out.println(obj2);
		System.out.println(obj1.get(1));
		obj2.remove(1);
		System.out.println(obj2);

	}

}
