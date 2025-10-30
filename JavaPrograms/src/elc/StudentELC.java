package elc;

import blc.Student;

import java.util.*;

public class StudentELC {

	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student id :");
		
		int id = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Enter Student Name ");
		
		String name = sc.nextLine();
		
		System.out.println("Enter Student Marks ");
		
		int marks = Integer.parseInt(sc.nextLine());
		
		s1.setStudentData(id, name, marks);
		
		s1.display();
		
		sc.close();
		
	}
}
