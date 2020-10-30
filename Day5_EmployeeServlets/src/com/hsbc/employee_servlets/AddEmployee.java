package com.hsbc.employee_servlets;

import com.hsbc.employee.Employee;
import com.hsbc.employee.EmployeeRepositoryImpl;
import com.hsbc.employee.EmployeeRepository;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		int empsalary=Integer.parseInt(request.getParameter("empsalary"));
		EmployeeRepository e= new EmployeeRepository(empid,empname,empsalary);
		EmployeeRepositoryImpl ei=new EmployeeRepositoryImpl();
		ei.addEmployee(e);
		out.println("Employee Added"+ei.displayEmployee());
		
	}

}
