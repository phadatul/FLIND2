package com.hsbc.entity;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String name, double salary) {
        this();
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[id = " + empId + ", name = " + name + ", salary = " + salary + "]";
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.valueOf(empId).compareTo(other.empId);
    }
}