package com.xworkz.function;

import com.xworkz.functions.Starter;

public class Labour {

	public void startMotor(Starter starter) {
		if (starter != null) {
			System.out.println(" starter is not null");
			starter.on();
		} else {
			System.out.println("starter is null");
		}
	}

}
