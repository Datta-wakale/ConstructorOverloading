package elc;

import java.util.Scanner;

import blc.EmployeeSalaryBlc;

public class SalEmployeeElc {

	public static void main(String[] args)
	{
		
		EmployeeSalaryBlc emp =new EmployeeSalaryBlc();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name : ");
		
		String fname = sc.nextLine();
		
		System.out.println("enter last name : ");
		String lname = sc.nextLine();
		
		
		System.out.println("Enter your EmployeeId : ");
		int empId= Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your salary : ");
		double sal = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter noOfProject : ");
		int noOfprjt= Integer.parseInt(sc.nextLine());
		
		emp.setEmployeeData(fname, lname, empId, noOfprjt, sal);
		emp.displayDetails();
		
		sc.close();

	}

}
