package elc;

import java.util.Scanner;
import blc.*;

public class TaxCalculation 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Name: ");
        String name = sc.nextLine();

        System.out.println("Enter  ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Basic Salary: ");
        double basicSalary = Double.parseDouble(sc.nextLine());

        System.out.println("Enter HRA Percentage: ");
        double HRAPer = Double.parseDouble(sc.nextLine());

        System.out.println("Enter DA Percentage: ");
        double DAPer = Double.parseDouble(sc.nextLine());

        PayrollForEmployee p1 = new PayrollForEmployee(id, name, basicSalary, HRAPer, DAPer);
        TaxUtil tax = new TaxUtil();

        System.out.println("\nSelect Employee Type (employee / manager / trainer / sourcing): ");
        String choice = sc.nextLine().toLowerCase();

        switch (choice)
        {
            case "employee":
                System.out.println("\n--- EMPLOYEE DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", p1.calculateGrossSalary());
                System.out.printf("Net Salary (after Tax): %.2f\n", tax.calculateTax(p1));
                break;

            case "manager":
                System.out.println("Enter Project Allowance: ");
                double projectAllowance = Double.parseDouble(sc.nextLine());
                Manager m = new Manager(p1, projectAllowance);
                System.out.println("\n--- MANAGER DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", m.calculateGrossSalary());
                System.out.printf("Net Salary (after Tax): %.2f\n", tax.calculateTax(m));
                break;

            case "trainer":
                System.out.println("Enter Batch Count: ");
                int batchCount = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Perk per Batch: ");
                double perkPerBatch = Double.parseDouble(sc.nextLine());
                Trainer t = new Trainer(p1, batchCount, perkPerBatch);
                System.out.println("\n--- TRAINER DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", t.calculateGrossSalary());
                System.out.printf("Final Salary (after Tax): %.2f\n", tax.calculateTax(t));
                break;

            case "sourcing":
                System.out.println("Enter Enrollment Target: ");
                int enTarget = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Enrollment Reached: ");
                int enReached = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Perk per Enrollment: ");
                double perkPerEnrollment = Double.parseDouble(sc.nextLine());
                Sourcing s = new Sourcing(p1, enTarget, enReached, perkPerEnrollment);
                System.out.println("\n--- SOURCING DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", s.calculateGrossSalary());
                System.out.printf("Final Salary (after Tax): %.2f\n", tax.calculateTax(s));
                break;

            default:
                System.out.println("Invalid choice. Please select employee / manager / trainer / sourcing.");
        }

        sc.close();
    }
}
