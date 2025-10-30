package blc;

public class TaxUtil
{
	public double calculateTax(PayrollForEmployee emp)
	{
		double salary = emp.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else {
			return salary-salary*5/100;
		}
	}
	
	public double calculateTax(Manager m)
	{
		double salary = m.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else
		{
			return salary-salary*5/100;
		}
	}
	
	public double calculateTax(Trainer t)
	{
		double salary = t.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else
		{
			return salary-salary*5/100;
		}
	}
	
	public double calculateTax(Sourcing s)
	{
		double salary = s.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else
		{
			return salary-salary*5/100;
		}
	}
	
}
