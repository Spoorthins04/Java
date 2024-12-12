package com.xworkz.cloth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.cloth.dto.ClothDTO;
import com.xworkz.cloth.entity.ClothEntity;
import com.xworkz.cloth.repository.ClothRepository;
import com.xworkz.cloth.repository.ClothRepositoryImp;

@Service
public class ClothserviceImp implements ClothService {

	private static final ClothEntity clothEntity = null;
	@Autowired
	
	private ClothRepository clothRepository;

	public boolean isValid(ClothDTO clothDTO) {
		ClothEntity foodEntity = new ClothEntity();
		foodEntity.setName(clothDTO.getName());
		foodEntity.setCost(clothDTO.getCost());
		
		boolean saved = ClothRepository.save(clothEntity);
		return false;
	}

}
