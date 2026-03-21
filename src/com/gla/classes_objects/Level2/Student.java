package com.gla.classes_objects.Level2;

public class Student {
	 String name;
	    int rollNumber;
	    double marks;
	    Student(String name, int rollNumber, double marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }
	    String calculateGrade() {
	        if (marks >= 90) return "A";
	        else if (marks >= 75) return "B";
	        else if (marks >= 60) return "C";
	        else if (marks >= 50) return "D";
	        else return "Fail";
	    }
	    void displayReport() {
	        System.out.println("Name       : " + name);
	        System.out.println("Roll No    : " + rollNumber);
	        System.out.println("Marks      : " + marks);
	        System.out.println("Grade      : " + calculateGrade());
	    }
	
	    public static void main(String[] args) {
	        Student s1 = new Student("Ishant", 28, 82);
	        s1.displayReport();
	    }
}
