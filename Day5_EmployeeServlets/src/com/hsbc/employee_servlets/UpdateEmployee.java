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
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
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
		int newempid=Integer.parseInt(request.getParameter("newempid"));
		String empname=request.getParameter("empname");
		String newempname=request.getParameter("newempname");
		int empsalary=Integer.parseInt(request.getParameter("empsalary"));
		int newempsalary=Integer.parseInt(request.getParameter("newempsalary"));
		EmployeeRepository e1= new EmployeeRepository (empid,empname,empsalary);
		EmployeeRepository e2= new EmployeeRepository (newempid,newempname,newempsalary);
		EmployeeImpl ei=new EmployeeImpl();
		ei.updateEmployee(e1,e2);
		out.println("Employee Deleted"+ei.showAllEmployees());
	}

}
