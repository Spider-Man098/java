package Slip10_1;
/* Implement a Java program to manage retail staff using OOP concepts. Define a
hierarchy: Worker → Supervisor → StoreManager.
A. Worker: Store and display worker name, ID, and date of birth.
B. Supervisor: Inherit Worker details and additionally include monthly salary.
C. StoreManager: Inherit Supervisor details and additionally include
profit-based incentives or commission (if applicable). */


import java.util.Scanner;

// Base Class
class Worker
{
    int id;
    String name;
    String dob;

    Worker(int id, String name, String dob)
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    void displayWorker()
    {
        System.out.println("\n===== WORKER DETAILS =====");
        System.out.println("Worker ID : " + id);
        System.out.println("Worker Name : " + name);
        System.out.println("Date of Birth : " + dob);
    }
}

// Derived Class
class Supervisor extends Worker
{
    double salary;

    Supervisor(int id, String name,
               String dob, double salary)
    {
        super(id, name, dob);

        this.salary = salary;
    }

    void displaySupervisor()
    {
        System.out.println("\n===== SUPERVISOR DETAILS =====");

        System.out.println("Monthly Salary : " + salary);
    }
}

// Derived Class
class StoreManager extends Supervisor
{
    double incentive;

    StoreManager(int id, String name,
                 String dob, double salary,
                 double incentive)
    {
        super(id, name, dob, salary);

        this.incentive = incentive;
    }

    void displayManager()
    {
        System.out.println("\n===== STORE MANAGER DETAILS =====");

        System.out.println("Profit Incentive : " + incentive);
    }
}

// Main Class
public class RetailStaff
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Worker ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Worker Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date of Birth: ");
        String dob = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Incentive: ");
        double incentive = sc.nextDouble();

        // Create Objects
        Worker w =
                new Worker(id, name, dob);

        Supervisor s =
                new Supervisor(id, name,
                        dob, salary);

        StoreManager sm =
                new StoreManager(id, name,
                        dob, salary, incentive);

        // Display All Details
        w.displayWorker();

        s.displaySupervisor();

        sm.displayManager();

        sc.close();
    }
}
