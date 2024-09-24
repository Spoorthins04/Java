package com.xworkz.principle.interfaces;

public class StreetLightImpl implements StreetLight {

	@Override
	public void turnOn() {
		System.out.println("running turnOn in StreetLightImpl");

	}

	@Override
	public void turnOff() {

		System.out.println("running turnOff in StreetImpl");
	}

}
