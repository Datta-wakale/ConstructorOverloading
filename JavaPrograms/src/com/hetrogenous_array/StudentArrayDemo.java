package com.hetrogenous_array;



public class StudentArrayDemo {

	public static void main(String[] args)
	{
		
		Student []student=new Student[3];
		student[0]=new Student(101, "Ravi",89.5);
		student[1]=new Student(102, "Anita", 92);
		student[2]=new Student(103, "Kiran", 85.75);
		
		
		for(Student s:student)
		{
			System.out.println(s);
		}

	}

}
