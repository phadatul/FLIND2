package com.hsbc.controllers;
import com.hsbc.entity.*;
import com.hsbc.DAO.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.DAO.EmployeeImpl;
import com.hsbc.entity.EmployeeRepository;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		int empsalary=Integer.parseInt(request.getParameter("empsalary"));
		EmployeeRepository e= new EmployeeRepository (empid,empname,empsalary);
		EmployeeImpl ei=new EmployeeImpl();
		ei.deleteEmployee(e);
		out.println("Employee Deleted"+ei.showAllEmployees());
	}

}
