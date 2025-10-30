package blc;

public class EmployeeBlcCalculate {

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int NoOfProject;

	public EmployeeBlcCalculate(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		if (noOfProject < 0) {
			System.err.println("Project Cannot be negative");
			System.out.println("salary Remains " + salary);
			System.exit(0);

		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		NoOfProject = noOfProject;
	}

	public String toString() {
		return "EmployeeBlcCalculate [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}

	public void calculateSalary() {
		int project = this.NoOfProject;
		System.out.println(this.salary);

		if (project > 5 && project < 10) {
			this.salary += 5000;
		}

		else if (project > 10 && project < 20) {
			this.salary += 10000;
		} else if (project > 20) {
			this.salary += 15000;
		}

		System.out.println("Updated salary is " + this.salary);

	}

}
