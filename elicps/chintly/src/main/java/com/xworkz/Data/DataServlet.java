package com.xworkz.Data;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")

public class DataServlet extends HttpServlet {

	public DataServlet() {
		System.out.println("created DataServlet");
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("running service in DataServlet....");

		String name = req.getParameter("Customer");
		String email = req.getParameter("Email");
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);

	}
}
