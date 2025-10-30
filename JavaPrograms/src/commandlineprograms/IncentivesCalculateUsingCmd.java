package commandlineprograms;

public class IncentivesCalculateUsingCmd {
	
	
	public static void main(String[] args) {
		
		double Bill_Incentives = Double.parseDouble(args[0]);
		double final_price;
		
		if(Bill_Incentives < 5000)
		{
			double discount = Bill_Incentives *5/100;
			final_price = Bill_Incentives-discount;
			System.out.println("your are discount is "+5+"% your discount amount is"+discount+"amount payable " +final_price);
		}
		else if(Bill_Incentives >= 5000 && Bill_Incentives< 10000)
		{	
			double discount = Bill_Incentives *10/100;
			final_price = Bill_Incentives - discount;
			System.out.println("your are discount is "+10+"% your discount amount is"+discount+"amount payable " +final_price);
		}
		else {
			
			double discount = Bill_Incentives *15/100;
			final_price = Bill_Incentives - discount;
			System.out.println("your are discount is "+15+"% your discount amount is"+discount+"amount payable " +final_price);
			
		}
	
	

}
	
}


