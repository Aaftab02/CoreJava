package com.edubridge.interfacedemo.methodreference;
/*Program to demonstrate on reference to an instance method*/
public class LearnerImplementation {
	
	public void learnMockito() 
	{
		System.out.println("Mockito with Junit-5");
	}

	public static void main(String[] args) {
		//reference to an instance method
		LearnerImplementation l1 = new LearnerImplementation();
		Learner l = l1::learnMockito;
		
		l.learn();

	}

}
