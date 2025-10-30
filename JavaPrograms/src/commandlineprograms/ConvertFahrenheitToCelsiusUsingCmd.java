package commandlineprograms;

public class ConvertFahrenheitToCelsiusUsingCmd {
	
	
	public static void main(String[] args) {
		
		
		double input_Celsius = Double.parseDouble(args[0]),
				
		 convert_Fahrenheit_to_Celsius = ((9 * input_Celsius)/5 )+32;
		
		System.out.printf("The conversion of Fahrenheit to Celsius is : %.2f" ,convert_Fahrenheit_to_Celsius);
		

	}

}


