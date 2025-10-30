package elc;

import java.util.Scanner;

import blc.Car;

public class ConstructorDemoElc {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("Enter car Model :");
		String model = sc.nextLine();
		
		System.out.println("Enter Car Manufacturing Year :");
		int year=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Car Price");
		double price = Double.parseDouble(sc.nextLine());
		
		Car c=new Car(model, year, price);
		System.out.println(c);
		
		sc.close();
		
		
	}

}
