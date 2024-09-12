package com.xworkz.internal;

import java.io.*;

public class Details {
	public static void main(String[] args) {
		String name = "spoorthi";
		String email = "spoorthi@gmail.com";
		String mobile = "9731276272";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("details.txt"))) {
			writer.write("Name: " + name + "\n");
			writer.write("Email: " + email + "\n");
			writer.write("Mobile: " + mobile + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
