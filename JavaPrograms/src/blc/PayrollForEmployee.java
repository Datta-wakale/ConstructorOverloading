package blc;

public class PayrollForEmployee 
{
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	
	public PayrollForEmployee(int employeeId,String employeeName,double basicSalary,double HRAPer,double DAPer)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
		
	}
	
	public double calculateGrossSalary()
	{
	    double hra = basicSalary * HRAPer / 100;
	    double da = basicSalary * DAPer / 100;
	    return basicSalary + hra + da;
	}

	
	 public String toString()
	    {
	        return String.format(
	            
	            "-----------------\n" +
	            "ID           : %d\n" +
	            "Name         : %s\n" +
	            "Basic Salary : %.2f\n" +
	            "HRA %%        : %.2f\n" +
	            "DA %%         : %.2f",
	            employeeId, employeeName, basicSalary, HRAPer, DAPer
	        );
	    }
	
	
	
}
