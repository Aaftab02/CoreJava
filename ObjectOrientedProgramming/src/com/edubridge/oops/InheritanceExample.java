package com.edubridge.oops;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary

It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an employee and a manager by making an 
object of both of these classes and print the same.
*/
class Member{
	String name;
	int age;
	long phoneNo;
	String address;
	int salary;
	void printSalary() {
		System.out.println("The salary of "+name+" is "+salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

public class InheritanceExample {

	public static void main(String[] args) {
		Employee e = new Employee();
		Manager m = new Manager();
		e.name = "Aaftab";
		e.age =23;
		e.phoneNo=9876543210l;
		e.salary = 45000;
		e.address = "Mumbai";
		e.specialization = "JAVA";
		System.out.println();
		m.name = "Aaftab";
		m.age =23;
		m.phoneNo=9876767609l;
		m.salary = 45000;
		m.address = "Mumbai";
		m.department = "Operations";
		System.out.println();
		

	}

}
