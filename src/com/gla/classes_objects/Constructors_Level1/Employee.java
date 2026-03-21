package com.gla.classes_objects.Constructors_Level1;

public class Employee {
	public int employeeID;       
    protected String department;  
    private double salary;        
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
}
