package com.xworkz.runner;

import com.xworkz.repository.AddressRepository;
import com.xworkz.repository.implement.AddressRepositoryImpl;
import com.xworkz.service.AddressService;
import com.xworkz.service.impl.AddressServiceImpl;

public class AddressServiceRunner {

	public static void main(String[] args) {

		AddressRepository repository = new AddressRepositoryImpl();
		AddressService service = new AddressServiceImpl(repository);
		boolean check = service.push();
		System.out.println(check);
		System.out.println("******");
		int no = service.refresh();
		System.out.println(no);
		System.out.println("----------");

		service.remove();
		System.out.println("remove this msg");

		String msg = service.load();
		System.out.println(msg);

	}

}
