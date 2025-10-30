package com.payroll_system;

public class Employee
{
	private int employeeId;
	private String employeeName;
	private double basicSalary,HRAPer,DAPer;
	
	public Employee(int employeeId,String employeeName,double basicSalary,double HRAPer,double DAPer)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
		
		
	}
	public double calculateGrossSalary()
	{
		double hra=basicSalary*HRAPer/100;
		double da=basicSalary*DAPer/100;
		return basicSalary+hra+da;
	}
	public String toString()
	{
		return String.format(
				
				"-------------\n"+
				"Id          : %d \n"+
				"Name        : %s \n"+
				"BasicSalary : %.2f \n"+
				"HRAPer      : %.2f \n"+
				"DAPer       : %.2f \n"+
				employeeId,employeeName,basicSalary,HRAPer,DAPer
				
				);
	}
	 
}
