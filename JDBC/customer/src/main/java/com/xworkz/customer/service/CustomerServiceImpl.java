package com.xworkz.customer.service;

import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public boolean save(CustomerDTO customerDTO) {

		boolean isValid = true;

		if (customerDTO != null) {

			if (!(customerDTO.getName().length() > 6 && customerDTO.getName().length() < 14)) {
				System.out.println("Name is incorrecnt");
				isValid = false;
			}

			if (!(customerDTO.getEmail().toUpperCase().contains("A") && customerDTO.getEmail().contains("@gmail.com")
					&& customerDTO.getEmail().length() == 8)) {
				System.out.println("Email is not valid");
				isValid = false;
			}

			if (!(customerDTO.getPhNo().length() == 10 && customerDTO.getPhNo().startsWith("9"))) {
				System.out.println("Phone number is not valid");
				isValid = false;
			}

			if (!(customerDTO.getAge() >= 18 && customerDTO.getAge() <= 65)) {
				System.out.println("Age is invalid");
				isValid = false;
			}

		}
		if (isValid) {
			CustomerRepoImpl customerRepoImpl = new CustomerRepoImpl();
			return customerRepoImpl.save(customerDTO);
		} else {
			return false;
		}

	}

}