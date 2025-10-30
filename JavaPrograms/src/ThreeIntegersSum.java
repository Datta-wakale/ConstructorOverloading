
public class ThreeIntegersSum {

	public static void main(String[] args) {

		
		double firstNo = Integer.parseInt(args[0]),
				secondNo = Integer.parseInt(args[1]),
				third_no = Integer.parseInt(args[2]);
		
		double sum=0 , average;
		
		sum =firstNo+secondNo+third_no;
		average = sum/3;
		
		System.out.println("The sum is =" +sum);
		System.out.println("The average is = "+average);
		
	
		

	}

}
