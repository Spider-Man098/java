package Slip3_1;

/* Create a Java program to manage employee payroll using OOP concepts. Include
functionalities such as employee creation, salary calculation, bonus allocation, and
payslip generation. Use inheritance for different employee types (e.g., full-time,
part-time). */

// Employee Payroll Management System using OOP

// Base Class
/*class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void calculateSalary() {
    }

    void generatePayslip() {

        System.out.println("\n===== PAYSLIP =====");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Total Salary : " + salary);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {

    double monthlySalary;
    double bonus;

    FullTimeEmployee(int id, String name,
                     double monthlySalary, double bonus) {

        super(id, name);

        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    void calculateSalary() {

        salary = monthlySalary + bonus;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int id, String name,
                     int hoursWorked, double ratePerHour) {

        super(id, name);

        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    void calculateSalary() {

        salary = hoursWorked * ratePerHour;
    }
}

// Main Class
public class EmployeePayroll {

    public static void main(String[] args) {

        // Full-Time Employee
        FullTimeEmployee emp1 =
                new FullTimeEmployee(101, "Rahul", 50000, 5000);

        emp1.calculateSalary();
        emp1.generatePayslip();

        // Part-Time Employee
        PartTimeEmployee emp2 =
                new PartTimeEmployee(102, "Amit", 5, 500);

        emp2.calculateSalary();
        emp2.generatePayslip();
    }
}
*/
*import java.util.Scanner;

// Base Class
class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void calculateSalary() {
    }

    void generatePayslip() {

        System.out.println("\n===== PAYSLIP =====");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Total Salary : " + salary);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {

    double monthlySalary;
    double bonus;

    FullTimeEmployee(int id, String name,
                     double monthlySalary, double bonus) {

        super(id, name);

        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    void calculateSalary() {

        salary = monthlySalary + bonus;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int id, String name,
                     int hoursWorked, double ratePerHour) {

        super(id, name);

        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    void calculateSalary() {

        salary = hoursWorked * ratePerHour;
    }
}

// Main Class
public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Full-Time Employee Input
        System.out.println("Enter Full-Time Employee Details");

        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double msalary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        FullTimeEmployee emp1 =
                new FullTimeEmployee(id1, name1, msalary, bonus);

        emp1.calculateSalary();
        emp1.generatePayslip();


        // Part-Time Employee Input
        System.out.println("\nEnter Part-Time Employee Details");

        System.out.print("Enter ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();

        System.out.print("Enter Rate Per Hour: ");
        double rate = sc.nextDouble();

        PartTimeEmployee emp2 =
                new PartTimeEmployee(id2, name2, hours, rate);

        emp2.calculateSalary();
        emp2.generatePayslip();

        sc.close();
    }
}


