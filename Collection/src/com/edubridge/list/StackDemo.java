package com.edubridge.list;
import java.util.Stack;
//Program to demonstrate on Stack
public class StackDemo {

	public static void main(String[] args) {
		Stack<Object>s=new Stack<>();
		s.add("Aaftab");
		s.add(12);
		s.add('c');
		System.out.println(s.lastElement());
		s.push(67.4);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		

	}

}
