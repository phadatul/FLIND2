package com.hsbc.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public EmployeeController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Oops! You called the wrong method");
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("AddEmployee") != null) {
			response.sendRedirect("addEmployee.html");
        } else if (request.getParameter("DeleteEmployee") != null) {
        	response.sendRedirect("DeleteEmployee.html");
        } else if (request.getParameter("DisplayEmployees") != null) {
        	response.sendRedirect("DisplayEmployee.html");
        } else if (request.getParameter("DisplayEmployees") != null) {
        	response.sendRedirect("index.html");
        }
	}

}
