package com.xworkz.Gun;

public class Police {

	public void shoot(Gun gun) {
		if (gun != null) {
			gun.fire();
			gun.display();
		} else {
			System.out.println("gun is null");
		}
	}
}
