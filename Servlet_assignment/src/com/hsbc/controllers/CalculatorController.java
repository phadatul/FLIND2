package com.hsbc.controllers;

import com.hsbc.cal.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorController")

public class CalculatorController extends HttpServlet {
	
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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
			//out.println("GET:EW, DAVID");
		out.println("Oops u called the wrong method...");
			//out.println(request.getParameter("password"));

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			//System.out.println("DOPOST............");
			
		PrintWriter out = response.getWriter();
			
		String one = request.getParameter("num1");
		String two = request.getParameter("num2");
		int num1 = Integer.parseInt(one);
		int num2 = Integer.parseInt(two);
			
		Calculator c = new Calculator();
		out.println(c.add(num1,num2));
			
			//out.println("POST: EW, DAVID");
			//out.println(request.getParameter("username"));
			//out.println(request.getParameter("password"));

		}
	}

