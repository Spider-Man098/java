import java.util.Scanner;

// Employee Class
class Employee {
    int empId;
    String name;
    double salary;
    String dob;


    void acceptEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");1
        name = sc.nextLine();
        System.out.print("Enter date of birth: ");
        dob = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayEmployee() {
        System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("date of birth : " + dob);
        System.out.println("Salary : " + salary);
    }
}

// Manager Class inherits Employee
class Manager extends Employee {
    String department;

    void acceptManager(Scanner sc) {
        acceptEmployee(sc);
        sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayManager() {
        System.out.println("\nManager Details");
        System.out.println("----------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }
}

// SalesManager Class inherits Manager
class SalesManager extends Manager {
    double commission;

    void acceptSalesManager(Scanner sc) {
        acceptManager(sc);

        System.out.print("Enter Commission: ");
        commission = sc.nextDouble();
    }

    void displaySalesManager() {
        System.out.println("\nSales Manager Details");
        System.out.println("----------------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
        System.out.println("Commission : " + commission);
        System.out.println("Total Salary : " + (salary + commission));
    }
}

// Main Class
public class s2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Employee");
            System.out.println("2. Manager");
            System.out.println("3. Sales Manager");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Employee e = new Employee();
                    e.acceptEmployee(sc);
                    e.displayEmployee();
                    break;

                case 2:
                    Manager m = new Manager();
                    m.acceptManager(sc);
                    m.displayManager();
                    break;

                case 3:
                    SalesManager sm = new SalesManager();
                    sm.acceptSalesManager(sc);
                    sm.displaySalesManager();
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
