package com.acmetech.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acmetech.web.dao.AlienDao;
import com.acmetech.web.model.Alien;

@WebServlet("/getAlien")
public class GetAlienController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		
		request.setAttribute("Alien", a1);
		
		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
	}
}
