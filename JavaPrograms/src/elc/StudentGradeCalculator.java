package elc;

import java.util.Scanner;

import blc.CalculateStudentGrade;
import blc.StudentGrade;
import blc.StudentScenario;

public class StudentGradeCalculator
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Marks : ");
		int marks = Integer.parseInt(sc.nextLine());
		
		StudentScenario s1 = new StudentScenario(name, marks);
		
		StudentGrade grade = CalculateStudentGrade.calculateGrade(s1);
		
		System.out.println(grade);
		
		sc.close();
	}

}
