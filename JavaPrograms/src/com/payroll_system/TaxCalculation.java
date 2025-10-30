package com.payroll_system;

import java.util.Scanner;

import blc.Manager;

public class TaxCalculation {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		
		System.out.println("Enter name:");
		String name = sc.nextLine();
		
		System.out.println("Enter basicSalary :");
		double bs = sc.nextDouble();
		
		System.out.println("Enter hraper:");
		double hraper=sc.nextDouble();
		
		System.out.println("Enter DAPer:");
		double DAPer=sc.nextDouble();
		
		Employee emp =new Employee(id, name, bs, hraper, DAPer);
		TaxUtill tax = new TaxUtill();
		
		System.out.println("Enter your choice:");
		String choice = sc.nextLine().toLowerCase();
		
		switch(choice)
		{
		case "employee" :
			System.out.println("Employee Details----");
			System.out.println(emp);
			System.out.printf("GrossSalary : %.2f",emp.calculateGrossSalary());
			System.out.printf("After Tax Salary : %.2f",tax.calculateTax(emp));
			break;
			
		case "manager":
			System.out.println("Enter project Allowance : ");
			double pr = Double.parseDouble(sc.nextLine());
			
			System.out.println("Manager Details----");
			System.out.println(emp);
			System.out.printf("Gross Salary : %.2f",m.calculateGrossSalary());
		}
		
		

	}

}
