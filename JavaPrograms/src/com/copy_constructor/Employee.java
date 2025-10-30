package com.copy_constructor;

public class Employee 
{

	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	public void setId(int id)
	{
		this.employeeId=id;
	}
	
	public int  getId()
	{
		return employeeId;
	}
	
	public void setName(String Name)
	{
		this.employeeName=Name;
	}
	
	public String getName()
	{
		return employeeName;
	}
	
	public String toString()
	{
		return " EmployeeId="+employeeId+ ", EmployeeName=" +employeeName+ " ";
	}
	
	
	
}
