package blc;

public class Sourcing 
{
	private PayrollForEmployee empinfo;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(PayrollForEmployee empinfo, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment)
	{
		super();
		this.empinfo = empinfo;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary()
	{
		return empinfo.calculateGrossSalary()+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
	
	
}
