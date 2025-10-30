package blc;

public class Manager 
{
	private PayrollForEmployee empinfo;
	
	private double projectAllowanace;

	public Manager(PayrollForEmployee empinfo, double projectAllowanace)
	{
		super();
		this.empinfo = empinfo;
		this.projectAllowanace = projectAllowanace;
	}
	
	public double calculateGrossSalary()
	{
		return empinfo.calculateGrossSalary()+projectAllowanace;
	}



	
	
	
	
	
	
}
