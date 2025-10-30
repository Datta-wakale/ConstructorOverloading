package commandlineprograms;

public class CycleSellingPriceUsingCmd {

	public static void main(String[] args) {
		
		
		int oldPrice= Integer.parseInt(args[0]), repaire = 250, colorCharge=350,newAccessories=500;
		
		int total_Price = oldPrice + repaire + colorCharge + newAccessories + 1500;
		
		System.out.println("Final price with 1500 profit is:" +total_Price);

	}

}
