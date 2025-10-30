package com.copy_constructor;

public class Doll 
{
	
	private String name;
	private double height;
	
	
	public Doll(String name, double height)
	{
		this.name=name;
		this.height=height;
	}
	
	public Doll(Doll d1)
	{
		this.name=d1.name;
		this.height=d1.height;
	}
	
	public String toString()
	{
		return "Doll [DollName " +name+ ", DollHeight " +height+ "]";
	}
	
}
