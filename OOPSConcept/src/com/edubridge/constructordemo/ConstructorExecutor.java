package com.edubridge.constructordemo;
/*program to demonstrate parameterized and non-parameterized constructor */ 
class Rectangle
{
	//instance variable
	int length;
	int breadth;
	//parameterized constructor
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	//Non parameterized constructor
	Rectangle(){
		System.out.println("Rectangle");
	}
	void displayArea() {
		System.out.println("Area of rectangle:"+length*breadth);
		System.out.println("Perimeter of rectangle:"+2*(length+breadth));
	}
}

public class ConstructorExecutor {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		Rectangle r3 = new Rectangle();
		r1.displayArea();
		r2.displayArea();
	}

}
