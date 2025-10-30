package com.copy_constructor;

public class Manager 
{
	private int managerId;
	private String managerName;
	
	public Manager(Employee emp)
	{
		this.managerId=emp.getId();
		this.managerName=emp.getName();
	}
	
	public String toString()
	{
		return "Manager [managerId=" +managerId + ", managerName=" + managerName+ "]";
	}
	
}
