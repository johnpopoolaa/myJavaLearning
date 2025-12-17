package com.acmetech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet4 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		Cookie cookies[] = req.getCookies(); // create an array of cookies
		
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k")) // search for the cookie you want in the array
				k = Integer.parseInt(c.getValue()); // parse the value from the array to integer and assign to the variable
		}
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
	}
}