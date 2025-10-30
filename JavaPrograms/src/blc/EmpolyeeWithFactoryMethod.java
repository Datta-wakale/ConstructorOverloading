package blc;

public class EmpolyeeWithFactoryMethod 
{
	
	private String name;
	private int id;
	private String department;
	private double salary;
	
	private EmpolyeeWithFactoryMethod(String name, int id, String department, double salary)
	{
		this.name=name;
		this.id=id;
		this.department=department;
	}
	
	public static EmpolyeeWithFactoryMethod createEployeeObject(String name, int id, String department,double salary)
	{
		return new EmpolyeeWithFactoryMethod(name,id,department,salary);
	}

	@Override
	public String toString()
	{
		return "EmpolyeeWithFactoryMethod [name=" + name + ", id=" + id + ", department=" + department + ", salary="
				+ salary + ", AnnualSalary=" +calculateAnnualSalary()+"]";
	}
	
    public double calculateAnnualSalary() {
        double annualSalary = salary * 12;

        double bonusPercentage = switch (department.toLowerCase()) {
            case "sales" -> {
                yield 0.10;
            }
            case "engineering" -> {
                yield 0.15;
            }
            case "hr" -> {
                yield 0.08;
            }
            default -> {
                yield 0.05;
            }
        };

        double bonus = annualSalary * bonusPercentage;
        return annualSalary + bonus;
    }

	
	}
	

