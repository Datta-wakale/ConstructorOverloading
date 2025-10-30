package com.static_factory_method;

public class Product
{
	private int id;
	private String name;
	private double price;
	
	private Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public String toString()
	{
		return "Product [Id=" +id+ " Name=" +name+ "Price="+price+"]";
	}
	
	public static Product getProductObject(int id, String name, double price)
	{
		return new Product(id, name, price);
	}
	
	
}
