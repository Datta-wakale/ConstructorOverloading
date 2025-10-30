package commandlineprograms;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		int BasicSalary = Integer.parseInt(args[0]);
		int HraOnSalary =  BasicSalary * 15/100;
		int ConveyanceAllowance = BasicSalary * 15/100;
		int EntertaimentAllowance =  BasicSalary* 10/100;
		int TotalSalary =BasicSalary+ HraOnSalary + ConveyanceAllowance + EntertaimentAllowance;
		
		System.out.println("Total salary of a Person with  all Allowance is " +TotalSalary);

	}

}
