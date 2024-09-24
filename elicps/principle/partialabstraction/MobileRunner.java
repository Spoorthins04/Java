package com.xworkz.principle.partialabstraction;

public class MobileRunner {

	public static void main(String[] args) {

		Mobile mobile = new Iphone();
		mobile.turnOn();
		mobile.turnOff();

	}

}
