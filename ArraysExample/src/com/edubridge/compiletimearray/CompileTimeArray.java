package com.edubridge.compiletimearray;

public class CompileTimeArray {

	public static void main(String[] args) {
		char[] arr= {'z','s','A','p'};
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		} //System.out.println(arr[4]) -this line will throw exception that the array length is out of bound

	}

}
