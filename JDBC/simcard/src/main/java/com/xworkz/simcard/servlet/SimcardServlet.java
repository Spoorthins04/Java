package com.xworkz.simcard.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.simcard.dto.SimcardDTO;
import com.xworkz.simcard.service.SimcardService;
import com.xworkz.simcard.service.SimcardServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/join-now")

public class SimcardServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		SimcardDTO simcardDTO = new SimcardDTO(firstName, lastName, email, password);
		SimcardServiceImpl sdcardService = new SimcardServiceImpl();

		sdcardService.save(simcardDTO);

		RequestDispatcher dispatcher = req.getRequestDispatcher("about.jsp");
		dispatcher.forward(req, resp);
	}
}
