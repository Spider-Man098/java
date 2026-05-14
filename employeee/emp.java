package employeee;

import java.util.Scanner;

public class emp
{
    int empId;
    String empName, category;

    double basic, hra, da, allowance, pf, incomeTax, gross, net;

    public void getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Employee Category: ");
        category = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basic = sc.nextDouble();
    }

    public void calculate()
    {
        hra = basic * 0.20;
        da = basic * 0.50;
        allowance = basic * 0.10;

        pf = basic * 0.12;
        incomeTax = basic * 0.05;

        gross = basic + hra + da + allowance;
        net = gross - (pf + incomeTax);
    }

    public void display()
    {
        System.out.println("\n----- Employee Salary Details -----");

        System.out.println("Employee ID       : " + empId);
        System.out.println("Employee Name     : " + empName);
        System.out.println("Employee Category : " + category);

        System.out.println("Basic Pay         : " + basic);
        System.out.println("HRA               : " + hra);
        System.out.println("DA                : " + da);
        System.out.println("Allowance         : " + allowance);
        System.out.println("PF                : " + pf);
        System.out.println("Income Tax        : " + incomeTax);
        System.out.println("Gross Pay         : " + gross);
        System.out.println("Net Pay           : " + net);
    }
}
