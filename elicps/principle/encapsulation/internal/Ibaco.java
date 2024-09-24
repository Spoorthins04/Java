package com.xworkz.principle.encapsulation.internal;

public class Ibaco {

	icecream icecream;

	public Ibaco(icecream icecream) {
		this.icecream = icecream;
	}

	public String access() {
		if (icecream != null)
			return icecream.getFlavour();
		else
			System.out.println("icecream is null");
		return null;
	}

	public void modify(String icecreamFlavour) {
		if (icecream != null)
			icecream.setFlavour(icecreamFlavour);
		else
			System.out.println("icecream is null");
		return;
	}

}
