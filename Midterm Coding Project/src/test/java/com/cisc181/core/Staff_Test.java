package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {
			
	@BeforeClass
	public static void setup() {	}
	
	@Test
	public void test1() {
		
		// Staff (note: kept dates null because irrelevant and time-consuming to create)
			Staff s1 = new Staff("Ryan", "Albert", "McNulty", null, "3 Sunflower Lane", "(111) 111-1111", "email1@udel.edu", "TR 4-5", 1, 200000, null, eTitle.MR);
			Staff s2 = new Staff("Dylan", "Michael", "Pizzico", null, "5 Pike Street", "2222222222", "email2@udel.edu", "MW 4-5", 2, 400000, null, eTitle.MR);
			Staff s3 = new Staff("Kyle", "Peter", "Corrigan", null, "234 Rainbow Avenue", "555-555-5555", "email3@udel.edu", "TR 1-2", 3, 600000, null, eTitle.MR);
			Staff s4 = new Staff("Mark", "Sean", "Murphy", null, "9 Lanes Lane", "7777777777", "email4@udel.edu", "MF 12-2", 4, 800000, null, eTitle.MR);
			Staff s5 = new Staff("Cathleen", "Anne", "Davis", null, "8 Unimaginative Circle", "9999999999", "email5@udel.edu", "WR 10-12", 5, 1000000, null, eTitle.MRS);
			
			ArrayList<Staff> StaffList = new ArrayList<Staff>();
			
			StaffList.add(s1);
			StaffList.add(s2);
			StaffList.add(s3);
			StaffList.add(s4);
			StaffList.add(s5);		

		double AverageSalary = (s1.getSalary() + s2.getSalary() + s3.getSalary() + s4.getSalary() + s5.getSalary()) / 5;
			
		assertEquals(AverageSalary,600000,0);
	}	

	@Test 
	public void test2() throws PersonException {
		
		Staff s6 = new Staff("Ryan", "Albert", "McNulty", null, "3 Sunflower Lane", "9087574441", "rmcnulty@udel.edu", "TR 4-5", 1, 200000, null, eTitle.MR);
		s6.getPhone();
		
	}

	@Test (expected = PersonException.class)
	public void test3() throws PersonException{

		Staff s7 = new Staff("Ryan", "Albert", "McNulty", null, "3 Sunflower Lane", "99999", "rmcnulty@udel.edu", "TR 4-5", 1, 200000, null, eTitle.MR);
		s7.getPhone(); //exception included in phone getter
	}
	
	@Test 
	public void test4() throws PersonException{
		Calendar d1 = GregorianCalendar.getInstance();
		d1.set(1990, Calendar.AUGUST, 30);
		Date date1 = d1.getTime();

		System.out.println("Staff Test #4");
		Staff s8 = new Staff("Ryan", "Albert", "McNulty", date1, "3 Sunflower Lane", "9999999999", "rmcnulty@udel.edu", "TR 4-5", 1, 200000, null, eTitle.MR);
		s8.PrintAge();	
	}
	
	@Test (expected = PersonException.class)
	public void test5() throws PersonException{
		Calendar d1 = GregorianCalendar.getInstance();
		d1.set(1910, Calendar.SEPTEMBER, 2);
		Date date1 = d1.getTime();

		Staff s9 = new Staff("Ryan", "Albert", "McNulty", date1, "3 Sunflower Lane", "9999999999", "rmcnulty@udel.edu", "TR 4-5", 1, 200000, null, eTitle.MR);
		s9.PrintAge() ; //exception included in DOB getter		
	}
}
