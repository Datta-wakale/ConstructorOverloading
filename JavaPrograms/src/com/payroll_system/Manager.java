package com.payroll_system;

public class Manager
{
	private Employee emp;
	private double projectAllowance;
	
	public Manager(Employee emp,double projectAllowance)
	{
		this.emp=emp;
		this.projectAllowance=projectAllowance;
	}
	
	public double calculateGrossSalary()
	{
		return emp.calculateGrossSalary()+projectAllowance;
	}
	
}
