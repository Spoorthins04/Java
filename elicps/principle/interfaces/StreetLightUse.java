package com.xworkz.principle.interfaces;

public class StreetLightUse {

	StreetLight streetlight;

	public StreetLightUse(StreetLight streetlight) {
		this.streetlight = streetlight;
	}

	public void switchOn() {
		if (streetlight != null)
			streetlight.turnOn();
	}

	public void switchOff() {
		if (streetlight != null)
			streetlight.turnOff();
	}

	public void increase() {
		if (streetlight != null)
			StreetLight.signal();
	}

}
