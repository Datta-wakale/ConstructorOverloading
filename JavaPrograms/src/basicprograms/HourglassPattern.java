package basicprograms;

import java.util.Scanner;

public class HourglassPattern {

	public static void main(String[] args) {
		
		
		Scanner user_input = new Scanner(System.in);
		
		int n = user_input.nextInt();
		
		int N = n*2-1;
		int x=1,y=N;
		
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if(j<=x || j>=y)
				{
					System.out.printf("%3c",'*');
				}
				else {
					System.out.printf("%3c",' ');
				}
			}
			if(i<n)
			{
				x++;
				y--;
			}
			else {
				x--;
				y++;
			}
			System.out.println();
		}
		user_input.close();

	}

}
