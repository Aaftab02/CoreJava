package com.edubridge.oops;

class Dog {
	String color = "Black";
}
/*we can inherit properties of class dog in class cat by using extend keyword
*cat is child and dog is parent
*with this procedure we dont have to create another object for class dog
*/
class Cat extends Dog{
	String color1="White";
}

public class SingleInheritance {

	public static void main(String[] args) {
		//Dog d = new Dog();
		Cat c = new Cat();
		System.out.println("Dog Color is:"+c.color+"\nCat color is:"+c.color1);

	}

}
