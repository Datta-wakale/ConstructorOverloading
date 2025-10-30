package blc;

public class EmployeeBlcSalaryCalculate {

	
	private int id;
	private String name;
	private double salary;
	
	public void setEmployeeDetails(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public void calculateSalaryIncrement()
	{
		if(this.salary<50000)
		{
			System.out.println("Salary increase amount is :"+this.salary*10/100);
			this.salary+=this.salary*10/100;
		}
		
		else if(this.salary>50000 && salary<80000)
		{
			System.out.println("Salary increase amount is :"+this.salary*7/100);
			this.salary+=this.salary*7/100;
		}
		
		else if(this.salary>80000)
		{
			System.out.println("Salary increase amount is :"+this.salary*5/100);
			this.salary+=this.salary*5/100;
		}
		
		System.out.println("After Increase , Updated Salary : "+this.salary);
	}


	public String toString() {
		return "EmployeeBlcSalaryCalculate [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
