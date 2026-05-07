/* Develop a Java application to manage student records using object-oriented
principles. The system should support student registration, updating details,
calculating grades, and displaying student information. */
package Slip4_1;
import java.util.Scanner;

class Student
{
    int rollNo;
    String name;
    int marks1, marks2, marks3;
    double percentage;
    char grade;

    // Register Student
    void registerStudent()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        marks3 = sc.nextInt();
    }

    // Update Student Details
    void updateDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter New Name: ");
        name = sc.nextLine();
    }

    // Calculate Grade
    void calculateGrade()
    {
        int total = marks1 + marks2 + marks3;

        percentage = total / 3.0;

        if(percentage >= 75)
        {
            grade = 'A';
        }

        else if(percentage >= 60)
        {
            grade = 'B';
        }

        else if(percentage >= 40)
        {
            grade = 'C';
        }

        else
        {
            grade = 'F';
        }
    }

    // Display Student Information
    void displayStudent()
    {
        System.out.println("\n===== Student Information =====");

        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }
}

public class StudentManagement
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.registerStudent();

        s.updateDetails();

        s.calculateGrade();

        s.displayStudent();
    }
}