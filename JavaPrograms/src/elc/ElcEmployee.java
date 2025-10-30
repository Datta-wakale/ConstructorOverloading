package elc;

import java.util.Scanner;

import blc.EmployeeBlcCalculate;

public class ElcEmployee {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter last name :");
		String lastName=sc.nextLine();
		
		System.out.println("Enter EmployeeId");
		int employeeId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter salary:");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter noOfProject : ");
		int NoOfProject= Integer.parseInt(sc.nextLine());
		
		EmployeeBlcCalculate emp = new EmployeeBlcCalculate(firstName, lastName, employeeId, salary, NoOfProject);
		System.out.println(emp);
		
		emp.calculateSalary();
		
		sc.close();

	}

}
