package com.hsbc.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.employeedata.Employee;
import com.hsbc.employeedata.EmployeeRepository;

/**
 * Servlet implementation class UpdateEmployeeController
 */
@WebServlet("/UpdateEmployeeController")
public class UpdateEmployeeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("OOPS! You called the wrong method.....");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		//String salary = request.getParameter("salary");
		
		int eid = Integer.parseInt(id);
		//int sal = Integer.parseInt(salary);
		
		
		EmployeeRepository.update(eid,name);
		out.println(EmployeeRepository.display());
	}

}
