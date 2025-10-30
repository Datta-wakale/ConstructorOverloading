package commandlineprograms;

public class FahrenheitToCelsiusUsingCmd2 {


		    public static void main(String[] args) {

		        double fahrenheit = Double.parseDouble(args[0]);
		        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		        System.out.printf("%.1f", celsius);
		    }
		


	}


