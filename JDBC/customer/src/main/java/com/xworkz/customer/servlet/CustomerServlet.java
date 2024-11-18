package com.xworkz.customer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerServlet extends HttpServlet {

	public CustomerServlet() {
		System.out.println("This is servlet class");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phNo = req.getParameter("phNo");
		String age = req.getParameter("age");
		String addNo = req.getParameter("addNo");
		String panNo = req.getParameter("panNo");

		int age1 = Integer.valueOf(age);

		CustomerDTO businessDTO = new CustomerDTO(name, email, phNo, age1, addNo, panNo);

		CustomerServiceImpl bussessServiceImpl = new CustomerServiceImpl();
		boolean saved = bussessServiceImpl.save(businessDTO);

		if (saved) {
			System.out.println("Dtat is saved successfully");
		} else {
			System.out.println("dtat is not saved");
		}
	}

}
