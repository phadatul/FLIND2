package com.hsbc.employee_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.employee.EmployeeRepository;
import com.hsbc.employee.Employee;
import com.hsbc.employee.EmployeeRepositoryImpl;

@WebServlet("/CalculatorController")

public class EmployeeServlet extends HttpServlet {

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
			
		String one = request.getParameter("empid");
		String two = request.getParameter("ename");
		String three = request.getParameter("salary");
		int empid = Integer.parseInt(one);
		int salary = Integer.parseInt(three);
		String ename = two;
			
		Employee e = new Employee(empid, ename, salary);
		EmployeeRepositoryImpl repo = new EmployeeRepositoryImpl();
		repo.addEmployee(e);
		out.println(repo.displayEmployee());
		
		//out.println(e.add(e));
			
			//out.println("POST: EW, DAVID");
			//out.println(request.getParameter("username"));
			//out.println(request.getParameter("password"));

		}
	

}
