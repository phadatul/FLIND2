package com.hsbc.DAO;
import com.hsbc.entity.*;
import java.util.*;
public class EmployeeImpl implements Employee {
List <EmployeeRepository> list =new ArrayList<EmployeeRepository>();
@Override
public void addEmployee(EmployeeRepository e) {
	list.add(e);

}

@Override
public void updateEmployee(EmployeeRepository oldEmployee, EmployeeRepository newEmployee) {
	list.set(list.indexOf(oldEmployee), newEmployee);

}

@Override
public void deleteEmployee(EmployeeRepository e) {
	list.remove(e);

}

@Override
public List<EmployeeRepository> showAllEmployees() {
	// TODO Auto-generated method stub
	return list;
}
}
