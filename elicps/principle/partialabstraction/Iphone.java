package com.xworkz.principle.partialabstraction;

public class Iphone extends Mobile {

	@Override
	public void turnOff() {
		System.out.println("running turnOff in Iphone");

	}

	public void turnOn() {
		System.out.println("running turnOn in Iphone");
	}

}
