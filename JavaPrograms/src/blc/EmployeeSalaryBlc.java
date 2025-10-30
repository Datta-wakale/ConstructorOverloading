package blc;

public class EmployeeSalaryBlc {
	
	
	
	String firstName,lastName;
	int employeeId,noOfProject;
	double salary;
	
	public void setEmployeeData(String fName,String lname,int empId,int noOfprjt,double sal)
	{
		
		firstName=fName;
		lastName = lname;
		employeeId=empId;
		noOfProject= noOfprjt;
		salary = sal;
		calculateSalary();
		
	}
	
	public void calculateSalary()
	{
		if(noOfProject>5 && noOfProject<=10)	salary = salary + 5000;
		
		else if(noOfProject>10 && noOfProject<20) salary = salary+10000;
		
		else if(noOfProject>20) salary+=15000;
		
		else salary += 0;
	}
	
	public void displayDetails()
	{
		
		System.out.println("the name of employee is : "+firstName);
		
		System.out.println("the Lname of employee is : "+lastName);
		
		System.out.println("the  employeeId is : "+employeeId);
		
		System.out.println("the noOfProject  of employee is : "+noOfProject);
		
		System.out.println("the salary of employee is : "+salary);
	}
	

}
