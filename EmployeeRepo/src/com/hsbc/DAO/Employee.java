package com.hsbc.DAO;
import java.util.*;
import com.hsbc.entity.*;

public interface Employee {
	public abstract void addEmployee(EmployeeRepository e);
	public abstract void updateEmployee(EmployeeRepository oldEmployee, EmployeeRepository newEmployee);
	public abstract void deleteEmployee(EmployeeRepository e);

	public abstract List<EmployeeRepository> showAllEmployees();

}
