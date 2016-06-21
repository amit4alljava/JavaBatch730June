package com.tcs.cms.teachers;

public class Teacher {
	// default  with in the package
	void computeMarks(){
		System.out.println("This is Compute Marks ");
	}
	public void result(){
		computeMarks();
		System.out.println("This is Final Result of Student");
	}
	// public - outside the package
	public void att(){
		System.out.println("Student Attendence");
	}
	
	

}
