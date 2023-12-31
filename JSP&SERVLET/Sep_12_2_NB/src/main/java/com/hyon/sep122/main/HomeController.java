package com.hyon.sep122.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("s","GAME START!");
			request.setAttribute("b","GAME START!");
			request.setAttribute("r","0th Round");
		}else {
			NBEngine nbe = NBEngine.getNBEngine();
			nbe.checkNum(request);
		}
		request.getRequestDispatcher("NB.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NBEngine nbe = NBEngine.getNBEngine();
		nbe.reset();
		request.setAttribute("s","GAME START!");
		request.setAttribute("b","GAME START!");
		request.setAttribute("r","0th Round");
		request.getRequestDispatcher("NB.jsp").forward(request, response);
	}

}
