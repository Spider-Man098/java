package Slip6_1;

/* Create a Java program to model an academic institution using OOP concepts like
inheritance, encapsulation, and polymorphism. Define a class hierarchy as follows:
Staff → Professor → Head of Department (HOD).
A. Staff: Store and display staff name, date of joining, and staff ID.
B. Professor: Inherit all Staff details and additionally display subject
specialization and salary.
C. HOD: Inherit all Professor details and additionally display department
allowance (if applicable). */



import java.util.Scanner;

// Base Class
class Staff
{
    int staffId;
    String name;
    String doj;

    Staff(int staffId, String name, String doj)
    {
        this.staffId = staffId;
        this.name = name;
        this.doj = doj;
    }

    void displayStaff()
    {
        System.out.println("\n===== STAFF DETAILS =====");
        System.out.println("Staff ID : " + staffId);
        System.out.println("Staff Name : " + name);
        System.out.println("Date of Joining : " + doj);
    }
}

// Derived Class
class Professor extends Staff
{
    String subject;
    double salary;

    Professor(int staffId, String name, String doj,
              String subject, double salary)
    {
        super(staffId, name, doj);

        this.subject = subject;
        this.salary = salary;
    }

    void displayProfessor()
    {
        System.out.println("\n===== PROFESSOR DETAILS =====");

        System.out.println("Subject : " + subject);
        System.out.println("Salary : " + salary);
    }
}

// Derived Class
class HOD extends Professor
{
    double allowance;

    HOD(int staffId, String name, String doj,
        String subject, double salary, double allowance)
    {
        super(staffId, name, doj, subject, salary);

        this.allowance = allowance;
    }

    void displayHOD()
    {
        System.out.println("\n===== HOD DETAILS =====");

        System.out.println("Department Allowance : " + allowance);
    }
}

// Main Class
public class Institution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Staff ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date of Joining: ");
        String doj = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Department Allowance: ");
        double allowance = sc.nextDouble();

        Staff s = new Staff(id, name, doj);

        Professor p = new Professor(id, name, doj,
                subject, salary);

        HOD h = new HOD(id, name, doj,
                subject, salary, allowance);

        s.displayStaff();

        p.displayProfessor();

        h.displayHOD();

        sc.close();
    }
}