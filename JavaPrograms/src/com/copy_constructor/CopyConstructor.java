package com.copy_constructor;

import java.util.Scanner;

public class CopyConstructor {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Id : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter name :");
		String name = sc.nextLine();
		
		Employee e1 = new Employee(id, name);
		System.out.println(e1);
		
		Manager m1 = new Manager(e1);
		System.out.println(m1);
		
		sc.close();
		
	}

}
