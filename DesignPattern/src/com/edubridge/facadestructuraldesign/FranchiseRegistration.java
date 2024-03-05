package com.edubridge.facadestructuraldesign;

public class FranchiseRegistration {
	Franchise KFC;
	Franchise McDonalds;
	Franchise Dominos;
	public FranchiseRegistration() {
		KFC = new KFC();
		McDonalds = new McDonalds();
		Dominos = new Dominos();
	}
	public void buyKFC() {
		KFC.option();
		KFC.cost();
	}
	public void buyMcDonalds() {
		McDonalds.option();
		McDonalds.cost();
	}
	public void buyDominos() {
		Dominos.option();
		Dominos.cost();
	}
}
