package com.xworkz.principle.interfaces;

public interface StreetLight {
	void turnOn();

	default void turnOff() {
		System.out.println("running turnOff in Streetlight");
		return;
	}

	static void signal() {
		System.out.println("running signal in Streetlight");
	}
}
