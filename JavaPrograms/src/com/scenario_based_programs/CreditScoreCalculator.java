package com.scenario_based_programs;

import java.util.Scanner;

public class CreditScoreCalculator {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Credit Card Point ");
		int creditPoint = Integer.parseInt(sc.nextLine());
		
		Customer c1 = new Customer(name, creditPoint);
		
		CardType offeredCard = CardOnOffer.getOfferedCard(c1);
		
		System.out.println(offeredCard);
		
		sc.close();

	}

}
