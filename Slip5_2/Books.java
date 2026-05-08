package Slip5_2;
/* Implement a Java program to manage a library system using OOP concepts such as
classes, inheritance, encapsulation, and polymorphism. Include features like adding
books, issuing books, returning books, and checking availability. */

import java.util.Scanner;

class Book
{
    int id;
    String name;
    boolean available;

    Book(int id, String name)
    {
        this.id = id;
        this.name = name;
        available = true;
    }
}
public class Books
    
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Book books[] = new Book[10];

        int count = 0;
        int choice;

        do
        {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                // Add Book
                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    books[count] = new Book(id, name);

                    count++;

                    System.out.println("Book Added Successfully");
                    break;

                // Issue Book
                case 2:

                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    for(int i = 0; i < count; i++)
                    {
                        if(books[i].id == issueId)
                        {
                            if(books[i].available)
                            {
                                books[i].available = false;
                                System.out.println("Book Issued");
                            }

                            else
                            {
                                System.out.println("Book Already Issued");
                            }
                        }
                    }

                    break;

                // Return Book
                case 3:

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    for(int i = 0; i < count; i++)
                    {
                        if(books[i].id == returnId)
                        {
                            books[i].available = true;

                            System.out.println("Book Returned");
                        }
                    }

                    break;

                // Display Books
                case 4:

                    System.out.println("\n===== BOOK DETAILS =====");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Book ID : " + books[i].id);
                        System.out.println("Book Name : " + books[i].name);

                        if(books[i].available)
                        {
                            System.out.println("Status : Available");
                        }

                        else
                        {
                            System.out.println("Status : Issued");
                        }

                        System.out.println("-------------------");
                    }

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