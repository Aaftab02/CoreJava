package com.edubridge.oops;

public class Employe {
	int empId = 101;
	String empName = "John Smith";
	int age = 21;
	void testing() {
		System.out.println("Testing is in progress");
	}

	public static void main(String[] args) {
		// object creation using new keyword
		Employe e1 = new Employe();
		/* Employe e1;
		 * e1 = new Employee();
		 */
		System.out.println("Employee Id:"+e1.empId+"\nEmployee Name:"+e1.empName+"\nEmployee Age:"+e1.age);
		e1.testing();

	}

}
