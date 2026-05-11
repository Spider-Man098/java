package Slip16_1;

/*Create a hierarchy of Employee, Manager, Sales Manager, they should have the
        following functionality:
        a) Employee: Display name, date of birth and id of Employee.
        b) Manager: Display all above information with salary drawn.
        c) Sales Manager: Display all above information and commission if applicable.*/

import java.util.Scanner;

// Base Class
class Employee
{
    int empId;
    String empName;
    String empDob;

    Employee(int empId, String empName, String empDob)
    {
        this.empId = empId;
        this.empName = empName;
        this.empDob = empDob;
    }

    void displayEmployee()
    {
        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Date of Birth : " + empDob);
    }
}

// Derived Class
class Manager extends Employee
{
    double salary;

    Manager(int id, String name,
            String dob, double salary)
    {
        super(id, name, dob);

        this.salary = salary;
    }

    void displayManager()
    {
        System.out.println("\n===== MANAGER DETAILS =====");
        System.out.println("Manager ID : " + empId);
        System.out.println("Manager Name : " + empName);
        System.out.println("Date of Birth : " + empDob);
        System.out.println("Salary : " + salary);
    }
}

// Derived Class
class SalesManager extends Manager
{
    double commission;

    SalesManager(int id, String name,
                 String dob, double salary,
                 double commission)
    {
        super(id, name, dob, salary);

        this.commission = commission;
    }

    void displaySalesManager()
    {
        System.out.println("\n===== SALES MANAGER DETAILS =====");
        System.out.println("Sales Manager ID : " + empId);
        System.out.println("Sales Manager Name : " + empName);
        System.out.println("Date of Birth : " + empDob);
        System.out.println("Salary : " + salary);
        System.out.println("Commission : " + commission);
    }
}

// Main Class
public class Company
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Employee Input
        System.out.println("\nEnter Employee Details");

        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();

        System.out.print("Enter Employee DOB: ");
        String edob = sc.nextLine();

        // Manager Input
        System.out.println("\nEnter Manager Details");

        System.out.print("Enter Manager ID: ");
        int mid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Manager Name: ");
        String mname = sc.nextLine();

        System.out.print("Enter Manager DOB: ");
        String mdob = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        double msalary = sc.nextDouble();
        sc.nextLine();

        // Sales Manager Input
        System.out.println("\nEnter Sales Manager Details");

        System.out.print("Enter Sales Manager ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Sales Manager Name: ");
        String sname = sc.nextLine();

        System.out.print("Enter Sales Manager DOB: ");
        String sdob = sc.nextLine();

        System.out.print("Enter Sales Manager Salary: ");
        double ssalary = sc.nextDouble();

        System.out.print("Enter Commission: ");
        double commission = sc.nextDouble();

        // Create Objects
        Employee e =
                new Employee(eid, ename, edob);

        Manager m =
                new Manager(mid, mname,
                        mdob, msalary);

        SalesManager sm =
                new SalesManager(sid, sname,
                        sdob, ssalary, commission);

        // Display
        e.displayEmployee();

        m.displayManager();

        sm.displaySalesManager();

        sc.close();
    }
}
