package elc;

import java.util.Scanner;

import blc.EmpolyeeWithFactoryMethod;

public class EmployeeMainForFactory {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many object you want to create : ");
		int n = Integer.parseInt(sc.nextLine());
		
		
		for(int i=1;i<=n;i++)
		{
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Id : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your department : ");
		String department = sc.nextLine();
		
		
		
		System.out.println("Enter your Salary :");
		double salary = Double.parseDouble(sc.nextLine());
		
		EmpolyeeWithFactoryMethod emp=EmpolyeeWithFactoryMethod.createEployeeObject(name, id, department, salary);
		emp.calculateAnnualSalary();
		System.out.println(emp);
		
		}
		
		sc.close();
		
	}

}
