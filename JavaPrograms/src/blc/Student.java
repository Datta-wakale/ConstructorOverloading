package blc;

public class Student {

	
	 int studentId;
	 String stdName;
	 int studentMarks;
	 char stdGrade;
	 
	 public void setStudentData(int id,String sName,int stdMarks)
	 {
		 studentId=id;
		 stdName=sName;
		 studentMarks=stdMarks;
		 calculateGrade();
	 }
	 
	 public void calculateGrade()
	 
	 {
		 if(studentMarks>90) stdGrade='A';
		 
		 else if(studentMarks>81 && studentMarks<90) stdGrade='B';
		 
		 else if(studentMarks>71 && studentMarks<80) stdGrade='C';
		 
		 else if(studentMarks>61 && studentMarks<70) stdGrade='D';
		 
		 else  stdGrade= 'E';
	 }
	 
	 public void display()
	 {
		 
		 System.out.println("Student id is : "+studentId);
		 System.out.println("Student name is : "+stdName);
		 System.out.println("Student Student Marks is : "+studentMarks);
		 System.out.println("Student Student grade is : "+stdGrade);
	 }
	
}
