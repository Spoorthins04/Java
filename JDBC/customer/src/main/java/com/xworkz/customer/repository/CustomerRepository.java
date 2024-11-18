package com.xworkz.customer.repository;

import com.xworkz.customer.dto.CustomerDTO;

public interface CustomerRepository {
	boolean save(CustomerDTO customerDTO);
	}

