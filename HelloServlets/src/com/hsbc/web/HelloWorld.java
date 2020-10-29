package com.hsbc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */


//@WebServlet - annotation by which this file will be opened in the browser
//it is the display name of the particular servlet
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("INIT...............");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("DESTROY............");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DOGET updated............");
		
		PrintWriter out = response.getWriter();
		out.println("GET:EW, DAVID");
		out.println(request.getParameter("username"));
		out.println(request.getParameter("password"));

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DOPOST............");
		PrintWriter out = response.getWriter();
		out.println("POST: EW, DAVID");
		out.println(request.getParameter("username"));
		out.println(request.getParameter("password"));

	}

}
