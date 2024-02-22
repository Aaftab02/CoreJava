package com.edubridge.list;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//Program to demonstrate on Linked List
public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(9);
		obj.add(3);
		System.out.println("List is: "+obj);
		obj.add(0, 5);
		System.out.println("List is: "+obj);
		System.out.println(obj.contains(10));
		System.out.println(obj.getClass());
		//obj.clear();
		//System.out.println(obj);
		
		//for extracting list elements
		for(Integer itr:obj)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		Iterator<Integer>itr=obj.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		/*sort method will sort according to ascending order wise and
		 * reverse method will arrange the elements according to insertion 
		 * order wise in the reverse order */
		Collections.reverse(obj);
		for(Integer itr1:obj)
		{
			System.out.print(itr1+" ");
		}
		//Collections.sort(obj);

	}

}
