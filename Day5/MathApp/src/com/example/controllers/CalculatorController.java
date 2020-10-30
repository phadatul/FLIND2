package com.example.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Calculator;

@WebServlet("/CalculatorController")
public class CalculatorController extends HttpServlet {       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Oops! you called wrong method");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String operation = request.getParameter("operation");
		
		int result;
		Calculator calculator = new Calculator();
		if (operation.equals("add")) {
			result = calculator.add(num1, num2);
		} else if (operation.equals("sub")) {
			result = calculator.subtract(num1, num2);
		} else if (operation.equals("mul")) {
			result = calculator.multiply(num1, num2);
		} else if (operation.equals("div")) {
			result = calculator.divide(num1, num2);
		} else {
			out.println("Operation not allowed!");
			return;
		}
		out.println(result);
	}
}
