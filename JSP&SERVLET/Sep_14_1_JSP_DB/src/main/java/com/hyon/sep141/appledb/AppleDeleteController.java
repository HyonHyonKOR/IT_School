package com.hyon.sep141.appledb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AppleDeleteController")
public class AppleDeleteController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AppleDBManager.getInstance().deleteApple(request);
		AppleDBManager.getInstance().groupApples(1, request);
		request.setAttribute("cp","apple/apple.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
