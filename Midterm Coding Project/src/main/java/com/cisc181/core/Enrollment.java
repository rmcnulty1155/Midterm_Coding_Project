package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	
	private double Grade;
	
	private Enrollment() {
		
	}

	public Enrollment(UUID sectionID, UUID studentID) {
	this.SectionID = sectionID;
	this.StudentID = studentID;
	this.EnrollmentID = EnrollmentID;
	
	}
	
	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void SetGrade(double grade) {
	this.Grade = grade;
	
	}
	

	


	
	
}
