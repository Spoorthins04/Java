package com.xworkz.function.usage;

import com.xworkz.function.Labour;
import com.xworkz.functions.Starter;

public class LambdaRunner {
	public static void main(String args[]) {
		Starter starter = () -> {
			System.out.println("running on in lambda expression");
		};

		Labour labour = new Labour();
		labour.startMotor(starter);

	}
}
