package com.xworkz.events.exception;

import java.util.regex.Pattern;

public class ServiceImpl {

	public void saveAmount(double amount) {
		if (amount > 100) {
			System.out.println("valid amount");
		} else {
			System.out.println("invalid amount");
			throw new InvalidAmountException();
		}

	}

	public void saveEmail(String email) throws InvalidEmailException {

		String regex = "^([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com))$";
		if (email == null || email == "") {
			System.out.println("email is empty");
			throw new InvalidEmailException();
		} else {
			Pattern pattern = Pattern.compile(regex);
			if (pattern.matcher(email).matches()) {
				System.out.println("valid email");
			} else {
				System.out.println("invalid email");
				throw new InvalidEmailException();
			}
		}
	}

}
