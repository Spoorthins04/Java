package com.xworkz.cafe.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cafe.service.CafeServiceImp;

@WebServlet(loadOnStartup = 1, urlPatterns = "/list")
public class ListServlet extends HttpServlet {
	public ListServlet() {
		System.out.println("created no args ListServlet const");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int convertedId = Integer.valueOf(id);
		CafeServiceImp cafeServiceImp = new CafeServiceImp();
		String ref = cafeServiceImp.getListById(convertedId);

		if (ref != null) {
			System.out.println(ref);
			req.setAttribute("success", ref);
		} else {
			req.setAttribute("failure", "this id not present");
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher("name.jsp");
		dispatcher.forward(req, resp);
	}

}
