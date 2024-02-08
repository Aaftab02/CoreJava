package com.edubridge.stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer b = new StringBuffer("Aaftab");
		System.out.println(b.capacity());  //22
		String str = "Edubridge";
		StringBuffer b1 = new StringBuffer(str.length());
		System.out.println(b1.capacity());  //9
		//  System.out.println(str.capacity()); //capacity method is not allowed for the string
		StringBuffer b2 = new StringBuffer("Internet of Things");
		System.out.println(b2.capacity());  //34
		b2 = new StringBuffer(" ");
		System.out.println(b2.capacity()); //17
		/* as string is immutable we can't do any modification */
		//System.out.println(str.append(" India"));
		b = new StringBuffer("Edubridge");
		System.out.println(b.append(" India"));
		b1 = new StringBuffer("Jeva");
		System.out.println(b1);
		System.out.println(b1.charAt(1));
		b1.setCharAt(1,'a');
		System.out.println(b1.charAt(1));
		System.out.println(b1);
		b2 = new StringBuffer();
		/*b.setCharAt(16, 'x');
		System.out.println(b);*/ //It will throw an error of String index out of bound

	}

}
