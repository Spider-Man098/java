package employeee;

import java.util.Scanner;

public class emp {

    int id;
    String name;
    double salary;

    Scanner sc = new Scanner(System.in);

    public void getData() {

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void calculate() {

        salary = salary;
    }

    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
