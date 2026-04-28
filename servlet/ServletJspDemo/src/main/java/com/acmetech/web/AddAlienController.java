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

@WebServlet("/addAlien")
public class AddAlienController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		String tech = request.getParameter("tech");
		
		Alien a = new Alien();
		a.setAid(aid);
		a.setAname(aname);
		a.setTech(tech);
		
		request.setAttribute("alien", a);
		
		AlienDao dao = new AlienDao();
		if(dao.addAlien(a)) {
			RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
			rd.forward(request, response);
		} else {
			response.getWriter().println("Error: Could not add Alien. (ID might already exist)");
		}
	}

}
