package commandlineprograms;

public class SimpleInterestCalculationUsingCmd {

	public static void main(String[] args) {
		
		double principle = Double.parseDouble(args[0]);
		
		double simple_intrest = (principle*3*12)/100;
		
		double Total_amt = simple_intrest + principle;
		
		System.out.println("Principle :"+principle);
		System.out.println("Simple intrest :"+simple_intrest);
		System.out.println("Totol_Amt :"+Total_amt);
		
		
		
		
	}

}
