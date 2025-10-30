package commandlineprograms;

public class FactorialUsingCmd {
	
	public static void main(String [] args)
	{
		
		double num = Double.parseDouble(args[0]);
		double Factorial = 1;
		while(num != 0)
		{
			Factorial = num * Factorial;
			num--;
		}
		
		System.out.println("The factorial of a no is " +Factorial);
		
	}

}
