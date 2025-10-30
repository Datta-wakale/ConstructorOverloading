package com.payroll_system;

public class Trainer
{
	private Employee emp;
	private int batchCount;
	private double perkPerBatch;
	
	public Trainer(Employee emp,int batchCount,double perkPerBatch)
	{
		this.emp=emp;
		this.batchCount=batchCount;
		this.perkPerBatch=perkPerBatch;
		
	}
	
	public double calculateGrossSalary()
	{
		return emp.calculateGrossSalary()+(batchCount*perkPerBatch);
	}
}
