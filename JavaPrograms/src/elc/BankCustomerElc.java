package elc;

import java.util.*;

import blc.BankDetails;

public class BankCustomerElc {

	public static void main(String[] args) {
		
		BankDetails fCustomer = new BankDetails();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Welcome to HDFC Bank ===");
		System.out.println("Enter customer Name :");
		
		String name = sc.nextLine();
		
		System.out.println("Enter a account Number: ");
		int accNumber=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Opening Balance : ");
		double balance =Double.parseDouble(sc.nextLine());
		
		System.out.println("Customer account created Successfully!");
		
		fCustomer.setCustomerDetails(name, accNumber, balance);
		
		
		while(true)
		{
			System.out.println("=====  Menu  =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. CheckBalance");
			System.out.println("4. Display customer Details");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice : ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
				
			 case 1:{
						System.out.println("Enter a deposit amount");
						double deposit=Double.parseDouble(sc.nextLine());
						fCustomer.deposit(deposit);
						break;
			       }
			 case 2:
			     {
			    	 System.out.println("Enter withdrwal amount:");
			    	 double amount = Double.parseDouble(sc.nextLine());
			    	 fCustomer.Withdraw(amount);
			    	 break;
			     }
			 case 3:
			 	{
			 		System.out.println("currentBalance is :"+fCustomer.getCurrentBalance());
			 		break;
			 	}
			 case 4:
			 	{
			 		System.out.println(fCustomer.displayData());
			 		break;
			 	}
			 case 5:
			 	{
			 		System.out.println("Thank you for banking with HDFC Bank!");
			 		sc.close();
			 		System.exit(0);
			 	}
			 	default: System.err.println("Invalid choice");
			}
			
			
		
		}
	}
	
}
