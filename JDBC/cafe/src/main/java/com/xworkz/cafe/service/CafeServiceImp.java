package com.xworkz.cafe.service;

import com.xworkz.cafe.dto.CafeDTO;
import com.xworkz.cafe.repo.CafeRepository;
import com.xworkz.cafe.repo.CafeRepositoryImp;

public class CafeServiceImp implements CafeService {

	public boolean validate(CafeDTO cafeDTO) {

		boolean valid = true;
		if (cafeDTO != null) {
			System.out.println("cafeDTO is not null");
			String firstName = cafeDTO.getName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(cafeDTO.getNumber());
			if (phoneNo != null && phoneNo.length() == 10) {
				System.out.println("PhoneNo is valid");
			} else {
				valid = false;
				System.err.println("PhoneNo is Not valid");
			}
//			String password=instituteDTO.getPassword();
//			if(password!=null && password.length()>4) {
//				System.out.println("password is valid");
//			}
//			 else {
//					valid = false;
//					System.err.println("password is Not valid");
//				}

			int age = cafeDTO.getAge();
			if (age > 18) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = cafeDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith("com") | email.endsWith("in"))) {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				CafeRepositoryImp cafeRepositoryImp = new CafeRepositoryImp();
				cafeRepositoryImp.save(cafeDTO);
			}

		}
		return valid;
	}

	public String getNameByPhone(String phone) {

		CafeRepositoryImp imp = new CafeRepositoryImp();
		String name = imp.getNameByPhone(phone);
		return name;

	}

	public int deleteDataById(int id) {

		CafeRepositoryImp imp = new CafeRepositoryImp();
		int value = imp.deleteDataById(id);
		return value;
	}

	public String updateByEmail(String email) {

		CafeRepositoryImp imp = new CafeRepositoryImp();
		String value = imp.updateByEmail(email);
		return value;
	}

	public String getListById(int id) {

		CafeRepositoryImp imp = new CafeRepositoryImp();
		String list = imp.getListById(id);
		return list;
	}

	@Override
	public boolean validate1(CafeDTO CafeDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
