package commandlineprograms;

public class ConvertCelsiusIntoFahrenheitUsingCmd {

	public static void main(String[] args) {
		
		
		double input_Fahrenheit = Double.parseDouble(args[0]),
				
				convert_Celsius = (input_Fahrenheit - 32) * 5/9;
		
		System.out.println("The conversion of Fahrenheit to Celsius is : "+convert_Celsius);
		

	}

}
