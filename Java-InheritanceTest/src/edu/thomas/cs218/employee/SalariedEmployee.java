package edu.thomas.cs218.employee;

/**
 * This class is a salaried employee that extends from employee
 * This class includes raises and tests for senior employees
 *
 */
public class SalariedEmployee extends Employee {
	private double RAISE = 250.00;
	private double SENIORITY_FACTOR = 1.25;
	private int SENIORITY_MINIMUM = 5;
	private double baseSalary;
	
	/**This constructor calls to the super constructor to make a salaried employee
	 * using similar parameters with an additional parameter of baseSalary
	 * @param empId
	 * Enter employee ID
	 * @param empName
	 * Enter employee name
	 * @param empYears
	 * Enter employee years of service
	 * @param empBaseSalary
	 * Enter employee base salary
	 */
	public SalariedEmployee(int empId, String empName, double empYears, double empBaseSalary)
	{
		super(empId, empName, empYears);
		baseSalary = empBaseSalary;
	}
	
	/**This method gets the base salary
	 * @return
	 * Returns base salary
	 */
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	/* (non-Javadoc)
	 * @see edu.thomas.cs218.employee.Employee#calcMonthlySalary()
	 */
	public double calcMonthlySalary() 
	{
		//I decided to store yearsOfService into a local variable just for typing convenience
		//I recognize that at any other time I could just call the super method for yearsOfService
		double years_OfService = Math.floor(super.getYearsOfService());
		double monthly_Salary = 0;
		if (years_OfService < SENIORITY_MINIMUM)
			monthly_Salary = baseSalary + (years_OfService * RAISE);
		else
			monthly_Salary = baseSalary + (years_OfService * SENIORITY_FACTOR * RAISE);
		
		return monthly_Salary;
	}
	
	/* (non-Javadoc)
	 * @see edu.thomas.cs218.employee.Employee#toString()
	 */
	public String toString()
	{
		return super.toString() + "BaseSalary:[" + baseSalary + "]";
	}

}
