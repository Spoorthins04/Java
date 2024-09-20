package com.xworkz.repository.implement;

import com.xworkz.repository.AddressRepository;

public class AddressRepositoryImpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("Address saved");
		return false;
	}

	@Override
	public int update() {
		System.out.println("Address update");
		return 0;
	}

	@Override
	public void delete() {
		System.out.println("Address deleted");

	}

	@Override
	public String read() {
		System.out.println("Address read");
		return null;
	}

}
