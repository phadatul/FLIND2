package com.example.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.models.Employee;
import com.example.repository.EmployeeRepository;

@WebServlet("/create")
public class AddEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Employee employee = new Employee();
		employee.setName(name);
		EmployeeRepository.getInstance().add(employee);
		response.sendRedirect("list");
	}
}
