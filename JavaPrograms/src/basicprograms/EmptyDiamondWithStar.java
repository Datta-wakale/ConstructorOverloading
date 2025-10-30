package basicprograms;

import java.util.*;

public class EmptyDiamondWithStar {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int N = n*2-1;
		
		int x=n, y=n;
		
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if(j<x || j>y)
				{
				System.out.printf("%3c",' ');
			
				}
				else
				{
					System.out.printf("%3c",'*');
				}
			}
			if(i<n)
			{
				x--;
				y++;
			}
			else
			{
				x++;
				y--;
			}
			System.out.println();	
		}

	}

}
