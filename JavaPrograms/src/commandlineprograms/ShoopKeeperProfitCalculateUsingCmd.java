package commandlineprograms;

public class ShoopKeeperProfitCalculateUsingCmd {

	public static void main(String[] args) {
		
		int  BasicTvPrice = Integer.parseInt(args[0]);
		int GstCharged, SellsProfit;
		 SellsProfit = BasicTvPrice * 27/100;
		 int  total_price=BasicTvPrice+SellsProfit;
		 GstCharged =(total_price * 5/100);
		 
		 int TotalSellingPrice =total_price + GstCharged;
		 
		 System.out.println("Total price is :" +TotalSellingPrice);
		 
		 
		 
		 

	}

}
