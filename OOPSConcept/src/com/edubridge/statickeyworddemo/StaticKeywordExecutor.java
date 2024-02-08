package com.edubridge.statickeyworddemo;
class LearnerDetails
{
	static String name;
	static int rollNo;
	/*2.institute name for all the learner are common so,
	 * we can declare institute name as static*/
	static String instituteName="Edubridge";
	/*3.if any method is non-static and if we want to access in main method then
	 * make that method as static */
	public static void print()
	{
		System.out.println(name+" "+rollNo+" "+instituteName);
	}
}
public class StaticKeywordExecutor {

	public static void main(String[] args) {
		LearnerDetails.rollNo=101;
		LearnerDetails.name="Aaftab";
		LearnerDetails.print();
		
		LearnerDetails.rollNo=102;
		LearnerDetails.name="Adil";
		LearnerDetails.print();

	}

}
