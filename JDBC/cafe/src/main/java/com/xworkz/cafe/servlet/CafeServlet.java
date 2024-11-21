package com.xworkz.cafe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cafe.dto.CafeDTO;
import com.xworkz.cafe.service.CafeService;
import com.xworkz.cafe.service.CafeServiceImp;

@WebServlet(loadOnStartup = 1, urlPatterns = "/select")
public class CafeServlet extends HttpServlet {

	public CafeServlet() {
		System.out.println("running no args CafeServlet const");
	}

	int id = 1;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("passwod");
		String number = req.getParameter("number");
		String age = req.getParameter("age");
		String address = req.getParameter("address");

		long convertedNumber = Long.valueOf(number);
		int convertedAge = Integer.valueOf(age);

		CafeDTO cafeDTO = new CafeDTO(name, email, password, convertedNumber, convertedAge, address, id);

		CafeServiceImp cafeServiceImp = new CafeServiceImp();
		boolean saved = cafeServiceImp.validate(cafeDTO);
		if (saved) {
			System.out.println("valid and saved ");
			id = id + 1;
			System.out.println(id);

		} else
			System.err.println("invalid and not saved");

	}

}
