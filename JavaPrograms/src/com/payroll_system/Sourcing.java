package com.payroll_system;

public class Sourcing 
{
	private Employee emp;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(Employee emp, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) 
	{
		super();
		this.emp = emp;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary()
	{
		return emp.calculateGrossSalary()+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
	
	
}
