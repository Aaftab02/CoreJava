package com.edubridge.typesofvariables;
//program to demonstrate types of variable
public class TypesOfVariablesDemo {

		//instance variable
		float salary=78900.56f;
		//static variable
		static int x=10;
		
		String display()
		{
			//local variable
			char res='z';
			System.out.println(res);
			return "Local Variables";
		}
		
		public static void main(String[] args) {
			System.out.println(x);
			TypesOfVariablesDemo obj=new TypesOfVariablesDemo();
			System.out.println(obj.display());
			System.out.println(obj.salary);
		}

}
