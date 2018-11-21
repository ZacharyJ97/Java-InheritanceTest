package edu.thomas.cs218.testing;

import org.junit.Assert;
import org.junit.Test;

import edu.thomas.cs218.employee.*;


public class SalaryTester
{
	private static final double EPSILON = 1E-12;

	@Test
	public void testJuniorSalariedEmployee()
	{
		Employee employee = 
				new SalariedEmployee(1001, "Cameron Thomaz", 4.9, 2000);
		double expected = 3000;
		Assert.assertEquals(expected, employee.calcMonthlySalary(), EPSILON);
		
		// Print employee info to console
		System.out.println(employee);
		System.out.println(employee.formatSalary());
	}

	@Test
	public void testSeniorSalariedEmployee()
	{
		/*
		 * Test calcMonthlySalary() for a SalariedEmployee, asserting
		 * that her expected monthly salary equals $4,875.
		 * 
		 * ID: 1002
		 * Name: Alecia Moore
		 * Year of Service: 6.8
		 * Base Salary: $3,000
		 * 
		 * In addition, print her employee info and formatted salary 
		 * to console. 
		 */
		Employee employee = 
				new SalariedEmployee(1002, "Alecia Moore", 6.8, 3000);
		double expected = 4875;
		Assert.assertEquals(expected, employee.calcMonthlySalary(), EPSILON);
		
		// Print employee info to console
		System.out.println(employee);
		System.out.println(employee.formatSalary());
	}

	@Test
	public void testJuniorExecutiveEmployee()
	{
		Employee employee = new ExecutiveEmployee(1003, "Neta-Lee Hershlag", 3.5, 6000);
		double expected = 8100;
		Assert.assertEquals(expected, employee.calcMonthlySalary(), EPSILON);
		
		// Print employee info to console
		System.out.println(employee);
		System.out.println(employee.formatSalary());
	}

	@Test
	public void testSeniorExecutiveEmployee()
	{
		/*
		 * Test calcMonthlySalary() for an ExecutiveEmployee, asserting
		 * that his expected monthly salary equals $11,475.
		 * 
		 * ID: 1004
		 * Name: Saul Hudson
		 * Year of Service: 13.4
		 * Base Salary: $5,500
		 * 
		 * In addition, print his employee info and formatted salary 
		 * to console. 
		 */
		Employee employee = 
				new ExecutiveEmployee(1004, "Saul Hudson", 13.4, 5500);
		double expected = 11475;
		Assert.assertEquals(expected, employee.calcMonthlySalary(), EPSILON);
		
		// Print employee info to console
		System.out.println(employee);
		System.out.println(employee.formatSalary());
	}

	@Test
	public void testJuniorBonusExecutiveEmployee()
	{
		/*
		 * Test calcMonthlySalary() for an ExecutiveEmployee, asserting
		 * that her expected monthly salary equals $8,640.
		 * 
		 * ID: 1005
		 * Name: Stefani Germanotta
		 * Year of Service: 2.7
		 * Base Salary: $6,700
		 * 
		 * In addition, print her employee info and formatted salary 
		 * to console. 
		 */
		Employee employee = 
				new ExecutiveEmployee(1005, "Stefani Germanotta", 2.7, 6700);
		double expected = 8640;
		Assert.assertEquals(expected, employee.calcMonthlySalary(), EPSILON);
		
		// Print employee info to console
		System.out.println(employee);
		System.out.println(employee.formatSalary());
	}

	@Test
	public void testSeniorBonusExecutiveEmployee()
	{
		/*
		 * Test calcMonthlySalary() for an ExecutiveEmployee, asserting
		 * that his expected monthly salary equals $8,640.
		 * 
		 * ID: 1006
		 * Name: Sean Carter
		 * Year of Service: 20.7
		 * Base Salary: $5,400
		 * 
		 * In addition, print his employee info and formatted salary 
		 * to console. 
		 */
		Employee employee = 
				new ExecutiveEmployee(1006, "Sean Carter", 20.7, 5400);
		double expected = 13980;
		Assert.assertEquals(expected, employee.calcMonthlySalary(), EPSILON);
		
		// Print employee info to console
		System.out.println(employee);
		System.out.println(employee.formatSalary());
	}

}
