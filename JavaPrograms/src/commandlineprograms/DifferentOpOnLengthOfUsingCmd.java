package commandlineprograms;

public class DifferentOpOnLengthOfUsingCmd {

	public static void main(String[] args) {
		
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Argument " + (i + 1) + ": " + args[i]);
		}
		
		if(args.length==0)
		{
			System.out.println("No arguments provided!");
			
		}
		else if(args.length==1)
		{
			int first_No = Integer.parseInt(args[0]);
			
			int Square = first_No * first_No;
			System.out.println("The Square of"+first_No+" = " +Square);
		}
		
		else if(args.length==2)
		{
			int first_No = Integer.parseInt(args[0]),
			second_No = Integer.parseInt(args[1]);
			int sum = 0,product;
			sum = first_No + second_No;
			product = first_No * second_No;
			
			System.out.println("The sum is ="+sum);
			System.out.println("The product is ="+product);
		}
		
		else if(args.length==4)
		{
			
			int first_No = Integer.parseInt(args[0]),
			second_No = Integer.parseInt(args[1]),
			third_No = Integer.parseInt(args[2]),
			fourth_No = Integer.parseInt(args[3]);
			
			System.out.println("Sum of all no is = "+(first_No+second_No+third_No+fourth_No));
					
					
		}
			

	}

}
