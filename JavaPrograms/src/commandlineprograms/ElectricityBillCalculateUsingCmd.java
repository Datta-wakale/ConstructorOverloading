package commandlineprograms;

public class ElectricityBillCalculateUsingCmd {

	public static void main(String[] args) {
		
		
		int unit_Spend = Integer.parseInt(args[0]),final_bill;
		
		if(unit_Spend <=100)
		{
			final_bill = 160;
			System.out.println("Your are bill is"+final_bill);
		}
		else if(unit_Spend >100 && unit_Spend<=250)
		{
			int final_value = unit_Spend - 100;
			final_bill = final_value + 160;
			System.out.println("the unit are"+unit_Spend+"The bill of amt are"+final_bill);
		}
		else {
			
			int final_value = unit_Spend - 250;
			final_bill = (int)(final_value * 1.2)+310;
			System.out.println("the unit are"+unit_Spend+"The amount of unit spend is"+final_bill);
		}
		
		
		

	}

}
