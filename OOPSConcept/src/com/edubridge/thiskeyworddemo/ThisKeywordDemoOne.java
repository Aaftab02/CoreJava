package com.edubridge.thiskeyworddemo;
/*It can be used to refer instance variable of current class*/

class Account
{
	//instance variable
	public String accType;
	public long accno;
	
	public void setData(String accType,long accno) 
	{
		this.accType=accType;
		this.accno=accno;
	}
	
	public void display() 
	{
		System.out.println(accType+" "+accno);
	}
}

//Driver Class
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setData("Saving", 23123123);
		acc.display();

	}

}
