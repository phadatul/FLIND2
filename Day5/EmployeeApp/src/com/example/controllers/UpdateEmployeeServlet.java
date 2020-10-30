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

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Employee e = EmployeeRepository.getInstance().get(id);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Update Employee (id: " + id + ")</h2>");
		out.println("<form method='POST'>");
		out.println("<input type='hidden' name='id' value='" + e.getId() + "'>");
		out.println("<input type='text' name='name' value='" + e.getName() + "'>");
		out.println("<input type='submit' value='update'>");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Employee e = EmployeeRepository.getInstance().get(id);
		e.setName(name);
		response.sendRedirect("list");
	}
}
