package commandlineprograms;

public class ArithmeticOperationUsingCmd {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("The sum is = " +(a+b));
		System.out.println("The Sub is = " +(a-b));
		System.out.println("The mul is = " +(a*b));
		System.out.println("The div is = " +(a/b));
		System.out.println("The Rem is = " +(a%b));

	}

}
