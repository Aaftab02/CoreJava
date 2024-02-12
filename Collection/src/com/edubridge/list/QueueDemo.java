package com.edubridge.list;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*Program to demonstrate on queue,to implement a queue use Priority Queue*/
public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(15);
		q1.add(11);
		q1.add(13);
		q1.add(2);
		System.out.println(q1);
		for(int i:q1)
		{
			System.out.print(i+" ");
		}
		//Deque<Integer> d=new ArrayDeque<>();
		Deque<Integer> d=new LinkedList<>();
		d.add(15);
		d.add(11);
		d.add(3);
		d.add(2);
		System.out.println(d);
		//addFirst and addLast can be used in deque and not in list(linked and array)
		d.addFirst(1);  
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		/*
		d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast(); */
		
		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();
		//When the deque is empty and we try to use removeLast,we will get error
		//of no such element exception but pollLast doesn't throw any exception 
		System.out.println(d);
		

	}

}
