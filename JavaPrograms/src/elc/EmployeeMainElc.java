package elc;

import java.util.Scanner;

import blc.EmployeeBlcSalaryCalculate;

public class EmployeeMainElc {

	public static void main(String[] args) {
		
		EmployeeBlcSalaryCalculate emp = new EmployeeBlcSalaryCalculate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee name : ");
		String name =sc.nextLine();
		
		System.out.println("Enter salary amount you have : ");
		double salary = Double.parseDouble(sc.nextLine());
		
		
		emp.setEmployeeDetails(id, name, salary);
		System.out.println("-----Employee Information --------");
		System.out.println(emp);
		
		
		System.out.println("-----Employee salary increament Details --------");
		emp.calculateSalaryIncrement();
		
		sc.close();

	}

}
