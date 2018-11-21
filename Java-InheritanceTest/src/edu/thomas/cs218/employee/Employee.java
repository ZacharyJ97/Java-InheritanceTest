package edu.thomas.cs218.employee;

/**
 * This class defines an object Employee.
 * Abstract due to the fact that there are many types of employees.
 * The leading abstract idea is that each employee is separated by Salary and any bonuses
 * This class will be a super class for salaried employees
 *
 */
public abstract class Employee {
	private int id;
	private String name;
	private double yearsOfService;
	
	/**This constructor sets up an employee with the following parameters
	 * @param empId
	 * The ID number of the employee
	 * @param empName
	 * The employee's name
	 * @param empYears
	 * The number of years that the employee has been working.
	 * You can enter decimal points, but for salaries, your years will round down
	 */
	public Employee(int empId, String empName, double empYears)
	{
		id = empId;
		name = empName;
		yearsOfService = empYears;
	}
	
	/**This method gets the employee's id
	 * @return
	 * returns the ID number
	 */
	public int getId()
	{
		return id;
	}
	
	/**This method gets the employee's name
	 * @return
	 * returns the name of the employee
	 */
	public String getName()
	{
		return name;
	}
	
	/**This method gets the years of service of the employee
	 * @return
	 * Returns the years of service of the employee
	 */
	public double getYearsOfService()
	{
		return yearsOfService;
	}
	
	/**Due to the variation in salaries this method is abstract in order to be defined by each subclass of employee
	 * @return
	 * Will return a double format of the salary once other subclasses define salary algorithms in respect to the employee
	 */
	public abstract double calcMonthlySalary();
	
	/**This method sets up a simple format for salary display
	 * @return
	 * Returns the format for a Salary plus the salary calculated by the subclasses
	 */
	public String formatSalary()
	{
		return "Salary: $" + Math.round(calcMonthlySalary()) + "\n";
	}
	
	//Um, I'm just gonna leave this here as comments, it happened when I went to Javadoc toString
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return this.getClass().getSimpleName() + ":[" + id + "] Employee Name: [" + name + "] Years of Service: [" + yearsOfService + "]" + "\n";
	}
		
	
	
	
}
