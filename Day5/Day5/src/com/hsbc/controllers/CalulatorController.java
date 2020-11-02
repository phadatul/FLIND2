package com.hsbc.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.entity.Calculator;

@WebServlet("/CalulatorController")
public class CalulatorController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Oops, you called wronh method.....");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String one = request.getParameter("num1");
		String two = request.getParameter("num2");
		
		int num1 = Integer.parseInt(one);
		int num2 = Integer.parseInt(two);
		
		
		Calculator c = new Calculator();
		out.println(c.add(num1, num2));
		
//		response.sendRedirect("");
//		RequestDispatcher d
		
	}

}
