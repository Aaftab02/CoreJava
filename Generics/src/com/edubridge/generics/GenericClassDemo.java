package com.edubridge.generics;
/*Program to demonstrate on Generic class by passing single parameter of same type*/
class Citizen<T>
{
	//where T defines any kind of type-values
	T str;
	T str1;
	
	void print(T str,T str1)
	{
		this.str=str;
		this.str1=str1;
		System.out.println("The value is: "+str+" "+str1);
	}
}

//Driver Class
public class GenericClassDemo {

	public static void main(String[] args) {
		Citizen<String>c=new Citizen<>();
		c.print("Mumbai", "Indian");
		

	}

}
