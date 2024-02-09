package com.edubridge.oopsassignment;
//Child class
public class Basketball extends Sports {
	
	@Override
	public void play(String sportName,int noOfPlayers)
	{
		System.out.println(sportName+" "+noOfPlayers);
	}

}
