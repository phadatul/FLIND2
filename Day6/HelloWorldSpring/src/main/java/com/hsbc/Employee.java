package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.stereotype.Component;
//
//@Component
public class Employee {

	private int empId;
	private String eName;
	private int salary;
	@Autowired
	private Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + empId;
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (empId != other.empId)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public void hello() {
		System.out.println("Hello World");
	}
}
