package elc;

import java.util.Scanner;

import blc.LoanBlc;

public class LoanDetailsElc {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Loan Amount : ");
		double principal=Double.parseDouble(sc.nextLine());
		
		
		System.out.println("Enter Interest Rate : ");
		double interestRate=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Number of Months for loan :");
		int durationMonths=Integer.parseInt(sc.nextLine());
		
		LoanBlc l1 = new LoanBlc(principal,interestRate,durationMonths);
		
		System.out.println("Principal : "+l1.getPrincipal());
		System.out.println("Interest Rate :"+l1.getInterestRate());
		System.out.println("Duration (Months) :"+l1.getDurationMonths());
		
		sc.close();
		
		
		
		

	}

}
