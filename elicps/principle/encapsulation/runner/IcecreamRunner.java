package com.xworkz.principle.encapsulation.runner;

import com.xworkz.principle.encapsulation.external.Pista;
import com.xworkz.principle.encapsulation.internal.icecream;
import com.xworkz.principle.encapsulation.internal.Ibaco;

public class IcecreamRunner {

	static String flavourName;

	public static void main(String[] args) {

		icecream icecream = new icecream();
		Ibaco ibaco = new Ibaco(icecream);
		flavourName = ibaco.access();
		System.out.println(flavourName);
		ibaco.modify("vanilla");
		System.out.println(ibaco.access());
		icecream icecream1 = new icecream();
		Pista pista = new Pista(icecream1);
		System.out.println(pista.access());

	}

}
