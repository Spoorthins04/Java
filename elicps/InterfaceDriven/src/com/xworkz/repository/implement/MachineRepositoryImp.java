package com.xworkz.repository.implement;

import com.xworkz.repository.MachineRepository;


public class MachineRepositoryImp implements MachineRepository {

	@Override
	public void save() {
		System.out.println("machine saved");

	}

	@Override
	public int update() {
		System.out.println("machine update");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("machine delete");
		return 0;
	}

	@Override
	public int read() {
		System.out.println("machine read");
		return 0;
	}

}

