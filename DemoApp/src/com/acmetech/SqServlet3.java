// Servlet to be called by AddServlet using HttpSession

package com.acmetech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession(); // create HttpSession object with the request
		
		int k = (int) session.getAttribute("k"); // get parameter from session object and type-cast it
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
	}
}
