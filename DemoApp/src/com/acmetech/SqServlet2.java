// Servlet to be called by another servlet with sendRedirect
// Get the parameters needed from the AddServlet with "getParameter()"

package com.acmetech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = Integer.parseInt(req.getParameter("k")); // get parameter from request object
		
		k = k * k;
		
		PrintWriter out = res.getWriter(); // create an object of output to be displayed with PrintWriter and use the getWriter method on response
		out.println("Result is " + k); // use println method on the object created by PrintWriter to print to the screen
	}
}
