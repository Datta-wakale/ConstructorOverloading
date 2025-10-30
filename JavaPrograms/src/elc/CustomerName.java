package elc;

import blc.Customer;

public class CustomerName {

	public static void main(String[] args) 
	{
		int val = 100;
		
		Customer c = new Customer("dp",2);
		
		m1(c);
		
		System.out.println(c.getId());
		
	

	}
	
	public static void m1(Customer cust)
	{
		cust.setId(5);
		
		cust = new Customer("Dk", 7);
		cust.setId(9);
		System.out.println(cust.getId());
	}

}
