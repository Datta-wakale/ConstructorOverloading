package blc;

public class StudentGrade {
	private StudentScenario student;
	private char studentGrade;

	public StudentGrade(StudentScenario student, char studentGrade)
	{
		super();
		this.student = student;
		this.studentGrade = studentGrade;
	}

	public StudentScenario getStudent() {
		return student;
	}

	public void setStudent(StudentScenario student) {
		this.student = student;
	}

	public char getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(char studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() {
		return "[The Student "+student.getName()+ " has '" + this.studentGrade + "' Grade]";
	}

}
