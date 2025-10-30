package blc;

public class BankDetails {

	
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	public static String bankName = "HDFC";
	public static String bankAddress = "Hyderabad";
	public static String bankIFSCCode = "HDFC001";
	
	public void setCustomerDetails(String name,int accNumber,double balance)
	{
		
		if(balance<=0)
		{
			
			System.err.println("Invalid Balance");
			System.exit(0);
			
		}
		else {
		
		customerName=name;
		accountNumber=accNumber;
		currentBalance=balance;
		}
		
		
	}
	
	public void Withdraw(double amount)
	{
		if(currentBalance<amount)
		{
			System.err.println("you have insufficients funds");
			System.exit(0);
		}
		else
		{
			currentBalance-=amount;
			System.out.println("Withdraw successfully"+currentBalance+"Debited \n");
		}
	}
	
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Enter deposit amount");
		}
		else
		{
			currentBalance+=amount;
			System.out.println("Deposit successfully :"+currentBalance+ "Credited\n");
		}
	}
	
	public double getCurrentBalance()
	{
		return currentBalance;	
	}

	
	public String displayData() {
		return "BankDetails [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
	}
	
	
}
