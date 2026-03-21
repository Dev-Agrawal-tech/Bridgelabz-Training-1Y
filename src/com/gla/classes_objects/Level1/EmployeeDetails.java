package com.gla.classes_objects.Level1;

public class EmployeeDetails {
	 String name;
	    int id;
	    double salary;
	    EmployeeDetails(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }
	    void displayDetails() {
	        System.out.println("Employee Name : " + name);
	        System.out.println("Employee ID   : " + id);
	        System.out.println("Salary        : " + salary);
	    }
	
	     public static void main(String[] args) {
	        EmployeeDetails emp1 = new EmployeeDetails("Ishant", 101, 25000);

	        emp1.displayDetails();
	    }
}
