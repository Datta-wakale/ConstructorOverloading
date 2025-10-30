package com.copy_constructor;

import java.util.Scanner;

public class MainDoll {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter DollName : ");
		String name = sc.nextLine();
		
		System.out.println("Enter DollHeight : ");
		double height = Double.parseDouble(sc.nextLine());
		
		Doll dl = new Doll(name, height);
		Doll dl2 = new Doll(name, height);
		
		System.out.println(dl);
		System.out.println(dl2);
		
		sc.close();
		
		
		
		

	}

}
