package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		/*NOTE: Couldn't figure out how to place data here while also ensuring said data was visible/accessible in test() method.
		I do recognize the purpose of @beforeclass, however, mainly how it could ensure this code runs more efficiently by 
		establishing/configuring a majority of the data included in test before any tests methods are actually run. Consequently,
		I only wrote one test in this code which checks all of the GPAs and average course grades. 
		*/
	}

	@Test
	public void test() {
		
		//Classes (3)
		Course c1 = new Course();
		c1.setCourseID(UUID.randomUUID());
		c1.setCourseName("CHEM111");
		c1.setGradePoints(4);
		c1.setMajor(eMajor.CHEM);
		
		Course c2 = new Course();
		c2.setCourseID(UUID.randomUUID());
		c2.setCourseName("CISC181");
		c2.setGradePoints(4);
		c2.setMajor(eMajor.COMPSI);
		
		Course c3 = new Course();
		c3.setCourseID(UUID.randomUUID());
		c3.setCourseName("PHYS207");
		c3.setGradePoints(4);
		c3.setMajor(eMajor.PHYSICS);
		
		ArrayList<Object> CourseList = new ArrayList<Object>();
		CourseList.add(c1);
		CourseList.add(c2);
		CourseList.add(c3);
		
		//Semesters (2) 
		Semester S = new Semester();
		S.setSemesterID(UUID.randomUUID());
		S.setStartDate(null);
		S.setEndDate(null);
		
		Semester F = new Semester();
		S.setSemesterID(UUID.randomUUID());
		S.setStartDate(null);
		S.setEndDate(null);
		
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		SemesterList.add(S);
		SemesterList.add(F);
	
		//Fall Classes (Sections) (3)
		Section sec1 = new Section();
		sec1.setCourseID(c1.getCourseID());
		sec1.setSemesterID(F.getSemesterID());
		sec1.setRoomID(204);
		sec1.setSectionID(UUID.randomUUID());
		
		Section sec2 = new Section();
		sec2.setCourseID(c2.getCourseID());
		sec2.setSemesterID(F.getSemesterID());
		sec2.setRoomID(387);
		sec2.setSectionID(UUID.randomUUID());
		
		Section sec3 = new Section();
		sec3.setCourseID(c3.getCourseID());
		sec3.setSemesterID(F.getSemesterID());
		sec3.setRoomID(111);
		sec3.setSectionID(UUID.randomUUID());
		
		//Spring Classes (Sections) (3)
		Section sec4 = new Section();
		sec4.setCourseID(c1.getCourseID());
		sec4.setSemesterID(S.getSemesterID());
		sec4.setRoomID(984);
		sec4.setSectionID(UUID.randomUUID());

		Section sec5 = new Section();
		sec5.setCourseID(c2.getCourseID());
		sec5.setSemesterID(S.getSemesterID());
		sec5.setRoomID(204);
		sec5.setSectionID(UUID.randomUUID());
		
		Section sec6 = new Section();
		sec6.setCourseID(c3.getCourseID());
		sec6.setSemesterID(S.getSemesterID());
		sec6.setRoomID(546);
		sec6.setSectionID(UUID.randomUUID());
		
		ArrayList<Section> SectionList = new ArrayList<Section>();
		SectionList.add(sec1);
		SectionList.add(sec2);	
		SectionList.add(sec3);			
		SectionList.add(sec4);	
		SectionList.add(sec5);	
		SectionList.add(sec6);	
		
		//Students (note: kept dates null because irrelevant for tests and time-consuming to create)
		Student s1 = new Student("Ryan","Albert","McNulty",null,eMajor.PHYSICS,"1 Student Lane","1111111111","student1@udel.edu");
		Student s2 = new Student("Dylan","Michael","Pizzico",null,eMajor.BUSINESS,"2 Student Lane","2222222222","student2@udel.edu");
		Student s3 = new Student("Kyle","Peter","Corrigan",null,eMajor.COMPSI,"3 Student Lane","93333333333","student3@udel.edu");
		Student s4 = new Student("Mark","Sean","Murphy",null,eMajor.CHEM,"4 Student Lane","4444444444","student4@udel.edu");
		Student s5 = new Student("Cathleen","Anne","Davis",null,eMajor.NURSING,"5 Student Lane","5555555555","student5@udel.edu");
		Student s6 = new Student("Linda","Marie","Smith",null,eMajor.PHYSICS,"6 Student Lane","6666666666","student6@udel.edu");
		Student s7 = new Student("Kenny","Michael","Surics",null,eMajor.BUSINESS,"7 Student Lane","7777777777","student7@udel.edu");
		Student s8 = new Student("Matthew","Thomas","Daniels",null,eMajor.NURSING,"8 SStudent Lane","8888888888","student8@udel.edu");
		Student s9 = new Student("Sara","Rose","Michaelson",null,eMajor.COMPSI,"9 Student Lane","9999999999","student9@udel.edu");
		Student s10 = new Student("Luke","Ronan","Thomas",null,eMajor.CHEM,"10 Student Lane","1234567891","student10@udel.edu");
		
		ArrayList<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		StudentList.add(s4);
		StudentList.add(s5);
		StudentList.add(s6);
		StudentList.add(s7);
		StudentList.add(s8);
		StudentList.add(s9);
		StudentList.add(s10);

		/** Grade Distribution Based off UD's 2016 Statistics for Undergraduates in Chemical Engineering Department (for fun)
		A/A-: 30%
		B+/B/B-: 42%
		C+/C/C-: 24%
		D+/D/D-: 3%
		F: 1%
		**/
		
		ArrayList<Integer> GradeDistribution = new ArrayList<Integer>();
		GradeDistribution.add(100);
		GradeDistribution.add(99);
		GradeDistribution.add(99);
		GradeDistribution.add(98);
		GradeDistribution.add(98);
		GradeDistribution.add(97);
		GradeDistribution.add(97);
		GradeDistribution.add(96);
		GradeDistribution.add(96);
		GradeDistribution.add(95);
		GradeDistribution.add(95);
		GradeDistribution.add(94);
		GradeDistribution.add(94);
		GradeDistribution.add(93);
		GradeDistribution.add(93);
		GradeDistribution.add(92);
		GradeDistribution.add(91);
		GradeDistribution.add(90);
		GradeDistribution.add(89);
		GradeDistribution.add(89);
		GradeDistribution.add(88);
		GradeDistribution.add(88);
		GradeDistribution.add(88);
		GradeDistribution.add(87);
		GradeDistribution.add(87);
		GradeDistribution.add(87);
		GradeDistribution.add(86);
		GradeDistribution.add(86);
		GradeDistribution.add(85);
		GradeDistribution.add(85);
		GradeDistribution.add(85);
		GradeDistribution.add(85);
		GradeDistribution.add(84);
		GradeDistribution.add(84);
		GradeDistribution.add(84);
		GradeDistribution.add(84);
		GradeDistribution.add(84);
		GradeDistribution.add(83);
		GradeDistribution.add(83);
		GradeDistribution.add(83);
		GradeDistribution.add(82);
		GradeDistribution.add(81);
		GradeDistribution.add(80);
		GradeDistribution.add(79);
		GradeDistribution.add(78);
		GradeDistribution.add(77);
		GradeDistribution.add(76);
		GradeDistribution.add(75);
		GradeDistribution.add(75);
		GradeDistribution.add(75);
		GradeDistribution.add(75);
		GradeDistribution.add(74);
		GradeDistribution.add(73);
		GradeDistribution.add(72);
		GradeDistribution.add(71);
		GradeDistribution.add(70);
		GradeDistribution.add(70);
		GradeDistribution.add(68);
		GradeDistribution.add(66);
		GradeDistribution.add(50);
				
		ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();
		ArrayList<Integer> WeightedGrades = new ArrayList<Integer>();
		int grade = 0;
		int counter = 0;
		
		for (int i = 0; i < StudentList.size(); i++) {
			for (int j = 0; j < SectionList.size(); j++) {
				Enrollment e = new Enrollment(SectionList.get(j).getSectionID(), StudentList.get(i).getStudentID());
				EnrollmentList.add(e);
				double numgrade = GradeDistribution.get(counter);
				e.SetGrade(numgrade);
				
				float x = (float)(numgrade);
				
				if (x >= 90) { grade = 4; }
				else if (x >= 80) { grade = 3; }
				else if (x >= 70) { grade = 2; }
				else if (x >= 60) { grade = 1; }
				else { grade = 0; }
					
				WeightedGrades.add(grade);
				counter++;
			}
		}
				
		//Student 1 (0-5)		
		double Class1Weight1 = c1.getGradePoints()*(WeightedGrades.get(0) + WeightedGrades.get(3));
		double Class2Weight1 = c2.getGradePoints()*(WeightedGrades.get(1) + WeightedGrades.get(4));
		double Class3Weight1 = c3.getGradePoints()*(WeightedGrades.get(2) + WeightedGrades.get(5));

		double GPA1 = (Class1Weight1 + Class2Weight1 + Class3Weight1) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA1 = Math.round(GPA1 * 100);
		GPA1 = GPA1/100;
		
		//Student 2 (6-11)		
		double Class1Weight2 = c1.getGradePoints()*(WeightedGrades.get(6) + WeightedGrades.get(9));
		double Class2Weight2 = c2.getGradePoints()*(WeightedGrades.get(7) + WeightedGrades.get(10));
		double Class3Weight2 = c3.getGradePoints()*(WeightedGrades.get(8) + WeightedGrades.get(11));

		double GPA2 = (Class1Weight2 + Class2Weight2 + Class3Weight2) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA2 = Math.round(GPA2 * 100);
		GPA2 = GPA2/100;
				
		//Student 3 (12-17)		
		double Class1Weight3 = c1.getGradePoints()*(WeightedGrades.get(12) + WeightedGrades.get(15));
		double Class2Weight3 = c2.getGradePoints()*(WeightedGrades.get(13) + WeightedGrades.get(16));
		double Class3Weight3 = c3.getGradePoints()*(WeightedGrades.get(14) + WeightedGrades.get(17));

		double GPA3 = (Class1Weight3 + Class2Weight3 + Class3Weight3) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA3 = Math.round(GPA3 * 100);
		GPA3 = GPA3/100;
		
		//Student 4 (18-23)		
		double Class1Weight4 = c1.getGradePoints()*(WeightedGrades.get(18) + WeightedGrades.get(21));
		double Class2Weight4 = c2.getGradePoints()*(WeightedGrades.get(19) + WeightedGrades.get(22));
		double Class3Weight4 = c3.getGradePoints()*(WeightedGrades.get(20) + WeightedGrades.get(23));

		double GPA4 = (Class1Weight4 + Class2Weight4 + Class3Weight4) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA4 = Math.round(GPA4 * 100);
		GPA4 = GPA4/100;
		
		//Student 5 (24-29)		
		double Class1Weight5 = c1.getGradePoints()*(WeightedGrades.get(24) + WeightedGrades.get(27));
		double Class2Weight5 = c2.getGradePoints()*(WeightedGrades.get(25) + WeightedGrades.get(28));
		double Class3Weight5 = c3.getGradePoints()*(WeightedGrades.get(26) + WeightedGrades.get(29));

		double GPA5 = (Class1Weight5 + Class2Weight5 + Class3Weight5) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA5 = Math.round(GPA5 * 100);
		GPA5 = GPA5/100;
		
		//Student 6 (30-35)		
		double Class1Weight6 = c1.getGradePoints()*(WeightedGrades.get(30) + WeightedGrades.get(33));
		double Class2Weight6 = c2.getGradePoints()*(WeightedGrades.get(31) + WeightedGrades.get(34));
		double Class3Weight6 = c3.getGradePoints()*(WeightedGrades.get(32) + WeightedGrades.get(35));

		double GPA6 = (Class1Weight6 + Class2Weight6 + Class3Weight6) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA6 = Math.round(GPA6 * 100);
		GPA6 = GPA6/100;
		
		//Student 7 (36-41)		
		double Class1Weight7 = c1.getGradePoints()*(WeightedGrades.get(36) + WeightedGrades.get(39));
		double Class2Weight7 = c2.getGradePoints()*(WeightedGrades.get(37) + WeightedGrades.get(40));
		double Class3Weight7 = c3.getGradePoints()*(WeightedGrades.get(38) + WeightedGrades.get(41));

		double GPA7 = (Class1Weight7 + Class2Weight7 + Class3Weight7) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA7 = Math.round(GPA7 * 100);
		GPA7 = GPA7/100;
	
		//Student 8 (42-47)		
		double Class1Weight8 = c1.getGradePoints()*(WeightedGrades.get(42) + WeightedGrades.get(45));
		double Class2Weight8 = c2.getGradePoints()*(WeightedGrades.get(43) + WeightedGrades.get(46));
		double Class3Weight8 = c3.getGradePoints()*(WeightedGrades.get(44) + WeightedGrades.get(47));

		double GPA8 = (Class1Weight8 + Class2Weight8 + Class3Weight8) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA8 = Math.round(GPA8 * 100);
		GPA8 = GPA8/100;
		
		//Student 9 (48-53)		
		double Class1Weight9 = c1.getGradePoints()*(WeightedGrades.get(48) + WeightedGrades.get(51));
		double Class2Weight9 = c2.getGradePoints()*(WeightedGrades.get(49) + WeightedGrades.get(52));
		double Class3Weight9 = c3.getGradePoints()*(WeightedGrades.get(50) + WeightedGrades.get(53));

		double GPA9 = (Class1Weight9 + Class2Weight9 + Class3Weight9) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA9 = Math.round(GPA9 * 100);
		GPA9 = GPA9/100;
		
		//Student 10 (54-59)		
		double Class1Weight10 = c1.getGradePoints()*(WeightedGrades.get(54) + WeightedGrades.get(57));
		double Class2Weight10 = c2.getGradePoints()*(WeightedGrades.get(55) + WeightedGrades.get(58));
		double Class3Weight10 = c3.getGradePoints()*(WeightedGrades.get(56) + WeightedGrades.get(59));

		double GPA10 = (Class1Weight10 + Class2Weight10 + Class3Weight10) / (2*(c1.getGradePoints() + c2.getGradePoints() + c3.getGradePoints()));
		GPA10 = Math.round(GPA10 * 100);
		GPA10 = GPA10/100;
			
		//Course Averages
		
		double Course1Grades = 0;
		double Course2Grades = 0;
		double Course3Grades = 0;
		
		for (int z = 0; z < EnrollmentList.size(); z++) {
			if (EnrollmentList.get(z).getSectionID() == SectionList.get(0).getSectionID()) { 
				Course1Grades = Course1Grades + EnrollmentList.get(z).getGrade();	
			} else if (EnrollmentList.get(z).getSectionID() == SectionList.get(1).getSectionID()) { 
				Course2Grades = Course2Grades + EnrollmentList.get(z).getGrade();	
			} else if (EnrollmentList.get(z).getSectionID() == SectionList.get(2).getSectionID()) {
				Course3Grades = Course3Grades + EnrollmentList.get(z).getGrade();	
			} else if (EnrollmentList.get(z).getSectionID() == SectionList.get(3).getSectionID()) {
				Course1Grades = Course1Grades + EnrollmentList.get(z).getGrade();	
			} else if (EnrollmentList.get(z).getSectionID() == SectionList.get(4).getSectionID()) {
				Course2Grades = Course2Grades + EnrollmentList.get(z).getGrade();	
			} else if (EnrollmentList.get(z).getSectionID() == SectionList.get(5).getSectionID()) {
				Course3Grades = Course3Grades + EnrollmentList.get(z).getGrade();	
			}
		}
		
		double Course1AverageGrade = Course1Grades / (2*StudentList.size());
		double Course2AverageGrade = Course2Grades / (2*StudentList.size());
		double Course3AverageGrade = Course3Grades / (2*StudentList.size());
		
		//GPATests
		
		assertEquals(GPA1,4.00,0);
		assertEquals(GPA2,4.00,0);
		assertEquals(GPA3,4.00,0);
		assertEquals(GPA4,3.00,0);
		assertEquals(GPA5,3.00,0);
		assertEquals(GPA6,3.00,0);
		assertEquals(GPA7,3.00,0);
		assertEquals(GPA8,2.17,0);
		assertEquals(GPA9,2.00,0);
		assertEquals(GPA10,1.33,0);
		
		//Average Course Grades (note: 2 sections to a course (one for each semester))
		
		assertEquals(Course1AverageGrade,85.35,0.0);
		assertEquals(Course2AverageGrade,84.70,0.0);
		assertEquals(Course3AverageGrade,83.35,0.0);
	}
}