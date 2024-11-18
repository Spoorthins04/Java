package com.xworkz.simcard.service;

import com.xworkz.simcard.repository.SimcardRepository;
import com.xworkz.simcard.dto.SimcardDTO;
import com.xworkz.simcard.repository.SimcardRepositoryImpl;

public class SimcardServiceImpl implements SimcardService {

	public boolean save(SimcardDTO simcardDTO) {

		boolean isvalid = true;

		if (simcardDTO == null) {
			isvalid = false;
		}

		if (simcardDTO.getFirstName().length() < 3 || simcardDTO.getFirstName().isEmpty()) {
			System.out.println("Data is incorrect");
			isvalid = false;
		}

		if (simcardDTO.getLastName().length() < 3 || simcardDTO.getLastName().isEmpty()) {
			System.out.println("Data is incorrect");
			isvalid = false;
		}

		if (!(simcardDTO.getEmail().contains("@gmail") && simcardDTO.getEmail().endsWith(".com")
				|| simcardDTO.getEmail().endsWith(".in"))) {
			System.out.println("Data is in correct");
			isvalid = false;
		}

		if (simcardDTO.getPassword().length() < 5) {
			System.out.println("Dtat is incorrect");
			isvalid = false;
		}

		if (isvalid) {
			SimcardRepositoryImpl simcardRepositoryImpl = new SimcardRepositoryImpl();
			return simcardRepositoryImpl.save(simcardDTO);
		} else {
			System.out.println("Data validation failed, not saving.");
			return false;
		}
	}
}
