package org.student;

import org.department.Department;

public class Student extends Department{
	public String studentName() {
return("victor");
}
	public String StudentDepartment() {
		return("mechanical engineering");
	}
	
	public void StudentId() {
		System.out.println("236541930");
	}
	public static void main(String[] args) {
		Student obj1 =new Student();
		obj1.StudentId();
		System.out.println(obj1.studentName());
		System.out.println(obj1.StudentDepartment());
		obj1.department();
		obj1.CollegeName();
		obj1.CollegeCode();
		obj1.CollegeRank();
		

	}
}