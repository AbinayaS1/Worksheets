package org.department;

import org.college.College;

public class Department extends College {
	public void department() {
		System.out.println("Mechanical department");
	}
    public static void main(String[] args) {
    	Department obj = new Department();
    	obj.CollegeName();
    	obj.CollegeCode();
    	obj.CollegeRank();
    	obj.department();
	}
}
