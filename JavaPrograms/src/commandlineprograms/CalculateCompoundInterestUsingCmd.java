package commandlineprograms;

public class CalculateCompoundInterestUsingCmd {

	public static void main(String[] args) {
		
		
		double principle_Amount = Double.parseDouble(args[0]),
				
				interest_Rate = Double.parseDouble(args[1]);
		
		double total_Amount = principle_Amount * ((1 + interest_Rate / 100)* (1 + interest_Rate / 100)* (1 + interest_Rate /100));
		
		System.out.println("The total amount including interest is = " +total_Amount);
		
		
		
		

	}

}
