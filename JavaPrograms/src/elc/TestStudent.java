package elc;

import java.util.Scanner;

import blc.StudentWithFactoryMethod;



public class TestStudent
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student age: ");
            int age = Integer.parseInt(sc.nextLine());
           

            System.out.print("Enter student grade: ");
            String grade = sc.nextLine();

            StudentWithFactoryMethod student = StudentWithFactoryMethod.createStudentObject(name, age, grade);
            System.out.println(student);

            System.out.print("Do you want to create another student? (yes/no): ");
            
            choice = sc.nextLine();
            System.out.println("\n");
            if (choice.equalsIgnoreCase("no"))
            {
                break;
            }
        }
        sc.close();
        System.out.println("Exiting student creation program.");
    }
}
