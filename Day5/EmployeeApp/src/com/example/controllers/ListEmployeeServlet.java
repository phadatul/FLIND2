package com.example.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.models.Employee;
import com.example.repository.EmployeeRepository;

@WebServlet("/list")
public class ListEmployeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<style>table, th, td {border: 1px solid;}</style>");
		out.print("<h2>Employee List</h2>");
		out.print("<a href='new_form.html'>Add</a>");
		final List<Employee> list = EmployeeRepository.getInstance().getAll();
		out.println("<table><tr><th>Id</th><th>Name</th></tr>");
		for (Employee e : list) {
			out.println("<tr>");
			out.println("<td>" + e.getId() + "</td><td>" + e.getName() + "</td>");
			out.println("<td><form method='POST' action='delete'><input type='hidden' value='" + e.getId() + "' name='id'><input type='submit' value='delete'></form></td>");
			out.println("<td><form method='GET' action='update'><input type='hidden' value='" + e.getId() + "' name='id'><input type='submit' value='update'></form></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}
}
