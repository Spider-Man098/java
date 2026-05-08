package Slip8_1;

/*Implement a Java program to manage bank accounts using object-oriented
        programming (OOP) concepts like classes, inheritance, encapsulation, and
        polymorphism. Include features like account creation, deposit, withdrawal, and
        balance inquiry.*/
import java.util.Scanner;

// Base Class
class Account
{
    int accNo;
    String name;
    double balance;

    // Create Account
    void createAccount(int no, String n, double bal)
    {
        accNo = no;
        name = n;
        balance = bal;
        System.out.println("Account Created Successfully");
    }

    // Deposit
    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount Deposited");
    }

    // Withdraw
    void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    // Balance Inquiry
    void checkBalance()
    {
        System.out.println("\nAccount No : " + accNo);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }
}

// Derived Class
class SavingsAccount extends Account
{
    void checkBalance()   // Polymorphism
    {
        System.out.println("\nSavings Account Balance : " + balance);
    }
}

public class BankSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SavingsAccount a = new SavingsAccount();

        int choice;

        do
        {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int no = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    a.createAccount(no, name, bal);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double dep = sc.nextDouble();
                    a.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double wd = sc.nextDouble();
                    a.withdraw(wd);
                    break;

                case 4:
                    a.checkBalance();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);

        sc.close();
    }
}
