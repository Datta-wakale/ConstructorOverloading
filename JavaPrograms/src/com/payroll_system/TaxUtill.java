package com.payroll_system;

public class TaxUtill 
{
	public double calculateTax(Employee e)
	{
		double salary = e.calculateGrossSalary();
		
		if(salary>=50000)
		{
			return salary-salary*20/100;
		}
		else 
			return salary-salary*5/100;
	}
	
	public double calculateTax(Manager m)
	{
		double salary = m.calculateGrossSalary();
		
		if(salary>=50000)
			return salary-salary*20/100;
		else
			return salary-salary*5/100;
		
	}
	
	public double calculateSalary(Trainer t)
	{
		double salary=t.calculateGrossSalary();
		
		if(salary>=50000)
			return salary-salary*20/100;
		else
			return salary-salary*5/100;
	}
	
	public double calculateSalary(Sourcing s)
	{
		double salary=s.calculateGrossSalary();
		
		if(salary>=50000)
			return salary-salary*20/100;
		else
			return salary-salary*5/100;
	}
	
	
}
