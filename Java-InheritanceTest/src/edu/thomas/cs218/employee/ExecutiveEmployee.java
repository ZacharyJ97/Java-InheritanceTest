package edu.thomas.cs218.employee;

/**
 * This class sets up a constructor and method for executive employees
 * Its super class is salaried employee as it borrows most characteristics
 * but adds a bonus rate for executives.
 */
public class ExecutiveEmployee extends SalariedEmployee {

	private double BONUS_RATE = 1.20;
	private int BONUS_ELIGIBLE_SALARY = 5000;
	
	/**This constructor sets up an executive employee but with the same parameters as the super class's
	 * salaried employee. The difference will come when the salary for this executive employee is calculated.
	 * @param empId
	 * Enter Employee ID
	 * @param empName
	 * Enter Employee Name
	 * @param empYears
	 * Enter Employee Years of Service
	 * @param empBaseSalary
	 * Enter Employee Base Salary
	 */
	public ExecutiveEmployee(int empId, String empName, double empYears, double empBaseSalary)
	{
		super(empId, empName, empYears, empBaseSalary);
	}
	
	/* (non-Javadoc)
	 * @see edu.thomas.cs218.employee.SalariedEmployee#calcMonthlySalary()
	 */
	public double calcMonthlySalary()
	{
		double monthlySalary = super.calcMonthlySalary();
		if (monthlySalary > BONUS_ELIGIBLE_SALARY)
			monthlySalary = monthlySalary * BONUS_RATE;
		
		return monthlySalary;
	}
	
}
