package com.xworkz.cloth.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.food")
@EnableWebMvc
public class ClothConfiguration {

	public ClothConfiguration() {
		System.out.println("running  clothConfiguration");
	}

}

