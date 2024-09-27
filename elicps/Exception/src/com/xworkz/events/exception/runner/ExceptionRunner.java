package com.xworkz.events.exception.runner;

import com.xworkz.events.exception.InvalidEmailException;
import com.xworkz.events.exception.ServiceImpl;

public class ExceptionRunner {

	public static void main(String[] args) throws InvalidEmailException {

		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.saveAmount(100000);
		serviceImpl.saveEmail("spoorthins@gmail.omc");

	}

}
