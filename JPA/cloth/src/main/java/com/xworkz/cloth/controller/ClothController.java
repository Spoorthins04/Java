package com.xworkz.cloth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cloth.dto.ClothDTO;
import com.xworkz.cloth.service.ClothService;

@Controller
@RequestMapping("/")
public class ClothController {

	@Autowired
	private ClothService foodService;

	public ClothController() {
		System.out.println("running FoodController");
	}

	@RequestMapping("/food")
	public String onClick(ClothDTO clothDTO) {
		System.out.println("running onClick method");
		System.out.println(clothDTO);
		boolean valid = ClothService.isValid(clothDTO);
		return "Cloth.jsp";
	}
}
