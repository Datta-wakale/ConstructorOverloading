package commandlineprograms;

public class SwapOfTwoNoWithout3rdVaribleUsingCmd {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The value of a After Swapping is" + a +  "The value of b after swapping is"+b);

	}

}
