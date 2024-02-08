package com.edubridge.oops;

class Shape{
	void draw() {
		System.out.println("Draw the shape");
	}
}
class Rectangle extends Shape{
	void area(int l,int b) {
		System.out.println("Area of rectangle:"+(l*b));
	}
}
class Square extends Rectangle{
	int a = 10;
	void sarea() {
		System.out.println("Area of square:"+(a*a));
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Square s = new Square();
		s.sarea();
		s.area(20, 10);
		s.draw();

	}

}
