package com.payroll_system;

public class Trainer
{
	private PayrollForEmployee empinfo;
	private int batchCount;
	private double PerkPerBatch;
	
	public Trainer(PayrollForEmployee empinfo, int batchCount, double perkPerBatch) 
	
	{
		super();
		this.empinfo = empinfo;
		this.batchCount = batchCount;
		PerkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary()
	{
		return empinfo.calculateGrossSalary()+(batchCount * PerkPerBatch);
	}
	
	
	
}
