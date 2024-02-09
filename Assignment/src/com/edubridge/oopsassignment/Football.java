package com.edubridge.oopsassignment;
//child class
public class Football extends Sports {
	@Override
	public void play(String sportName,int noOfPlayers)
	{
		System.out.println(sportName+" "+noOfPlayers);
	}

}
