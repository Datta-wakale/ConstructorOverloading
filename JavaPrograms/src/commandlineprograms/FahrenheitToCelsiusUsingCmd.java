package commandlineprograms;

public class FahrenheitToCelsiusUsingCmd {

	public static void main(String[] args) {
		
		int Fahrenheit = Integer.parseInt(args[0]);
		int Celsius = ((Fahrenheit-32)*5)/9;
		
		System.out.println("The conversion of Fahrenheit to Celsius is " +Celsius);
		

	}

}
