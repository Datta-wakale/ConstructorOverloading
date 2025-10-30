package blc;

public class StudentWithFactoryMethod 
{
	
	private String name;
	private int age;
	private String grade;
	
	
	private StudentWithFactoryMethod(String name, int age, String grade)
	{
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public static StudentWithFactoryMethod createStudentObject(String name,int age, String grade)
	{
		return new StudentWithFactoryMethod(name, age, grade);
	}

	
	public String toString()
	{
		return "StudentWithFactoryMethod [Name=" + name + ", Age=" + age + ", Grade=" + grade + "]";
	}
	
	
	
}
