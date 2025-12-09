// calling a servlet from another servlet using sendRedirect
// Create AddServlet that SqServlet would be called from

package com.acmetech;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1")); // get first parameter from html page
		int j = Integer.parseInt(req.getParameter("num2")); // get second parameter from html page
		
		int k = i + j;
		
		res.sendRedirect("sq?k="+k); // URL Rewriting to Redirect -> this falls under session management
	}

}
