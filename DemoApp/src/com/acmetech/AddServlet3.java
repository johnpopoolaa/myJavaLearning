// Using HttpSession to call a servlet from servlet
// create the HttpSession object and set the attribute to be sent

package com.acmetech;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		HttpSession session = req.getSession(); // create HttpSession object to get the request object
		session.setAttribute("k", k); // set the parameter to be sent and give it a name
		
		res.sendRedirect("sq"); // specify the address to redirect to
	}
}
