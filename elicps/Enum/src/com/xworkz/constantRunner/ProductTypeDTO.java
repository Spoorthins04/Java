package com.xworkz.constantRunner;
import com.xworkz.constant.ProductType;
import com.xworkz.constantDTO.CustomerDTO;

public class ProductTypeDTO {

	
	public static void main(String[] args) {
		CustomerDTO customer=new CustomerDTO("Spoorthi","spoorthi@gmail.com",ProductType.FURNITURE);
		customer.display();
	}
}
