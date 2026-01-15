// Using servlet annotation

package com.acmetech;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")

public class AddServlet5 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		Cookie cookie = new Cookie("k", k + ""); // create the cookie and convert the integer to string using + and ""(append)
		res.addCookie(cookie); // pass the cookie to the result, adding it
		
		res.sendRedirect("sq"); // specify the address to redirect to
	}
}
