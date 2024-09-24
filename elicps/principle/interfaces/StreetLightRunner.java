package com.xworkz.principle.interfaces;

public class StreetLightRunner {

	public static void main(String[] args) {

		StreetLight streetlight = new StreetLightImpl();
		StreetLightUse streetlightuse = new StreetLightUse(streetlight);
		streetlightuse.switchOn();
		streetlightuse.switchOff();
		streetlightuse.increase();
	}
}
