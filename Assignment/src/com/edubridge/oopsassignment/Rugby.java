package com.edubridge.oopsassignment;
//Child class
public class Rugby extends Sports {
	
	@Override
	public void play(String sportName,int noOfPlayers)
	{
		System.out.println(sportName+" "+noOfPlayers);
	}

}
