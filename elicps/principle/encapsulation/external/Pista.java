package com.xworkz.principle.encapsulation.external;

import com.xworkz.principle.encapsulation.internal.icecream;

public class Pista {

	icecream icecream;

	public Pista(icecream icecream) {
		this.icecream = icecream;
	}

	public String access() {
		if (icecream != null)
			return icecream.getFlavour();
		else
			return null;
	}

}
