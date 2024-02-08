package com.edubridge.finaldemo;
//parent class
/*We can't inherit the final class */
//public final class card
public class Card {
	private String cardName;
	//final var must be initialized
	//private final String issuer1;
	/*We can't change or set the value of variable declared as final*/
	private final String issuer="GOI";
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getIssuer() {
		return issuer;
	}
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + "]";
	}
	final void accept() 
	{
		System.out.println("This is Final Method");
	}

}
