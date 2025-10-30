package commandlineprograms;

public class PalindromeNo {

	public static void main(String[] args) {
		int rev = 0;
		int num = Integer.parseInt(args[0]);
		int number = num; 
		while(number != 0)
		{
			int Last = number % 10;
			rev = rev*10+Last;
			number/=10;
		}
		if(num == rev)
		{
			System.out.println("The no is palindrome" +rev);
		}
		else {
			System.out.println("The no is not palindrome" +rev);
		}

	}

}
