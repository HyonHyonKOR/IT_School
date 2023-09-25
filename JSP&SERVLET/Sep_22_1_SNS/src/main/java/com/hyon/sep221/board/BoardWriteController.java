package com.hyon.sep221.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyon.sep221.main.TokenManager;
import com.hyon.sep221.member.MemberDAO;


@WebServlet("/BoardWriteController")
public class BoardWriteController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(MemberDAO.loginCheck(request)) {
		  BoardDAO.getBdao().write(request);
		}
		TokenManager.make(request);
		request.setAttribute("cp", "board/board.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
