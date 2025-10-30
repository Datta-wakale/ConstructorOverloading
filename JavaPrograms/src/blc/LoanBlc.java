package blc;

public class LoanBlc {

	
			private double principal;
			private double interestRate;
			private int durationMonths;
			
			
			public LoanBlc(double principal, double interestRate, int durationMonths) 
			{
				super();
				if(principal<0 || interestRate<0 || durationMonths<0)
				{
					System.err.println("value must be positive");
					System.exit(0);
					
				}
				
					
				this.principal = principal;
				this.interestRate = interestRate;
				this.durationMonths = durationMonths;
			}


			public double getPrincipal() 
			{
				return principal;
			}


			public void setPrincipal(double principal) 
			{
				this.principal = principal;
			}


			public double getInterestRate()
			{
				return interestRate;
			}


			public void setInterestRate(double interestRate)
			{
				this.interestRate = interestRate;
			}


			public int getDurationMonths() 
			{
				return durationMonths;
			}


			public void setDurationMonths(int durationMonths)
			{
				this.durationMonths = durationMonths;
			}


			
		
			
			
			
			
			
}
