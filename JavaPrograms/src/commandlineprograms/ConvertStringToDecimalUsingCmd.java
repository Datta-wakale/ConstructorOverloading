package commandlineprograms;

public class ConvertStringToDecimalUsingCmd {

	public static void main(String[] args) {
		
		
		double first_decimal = Double.parseDouble(args[0]);
		double Second_decimal = Double.parseDouble(args[1]);
		
		System.out.println("The decimal multiplication of two nos = "+(first_decimal*Second_decimal));
		

	}

}
