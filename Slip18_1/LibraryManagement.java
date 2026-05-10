package Slip18_1;

/*Develop a Java-based library management application that demonstrates OOP
        principles and uses exception handling to handle cases like issuing books, returning
        books, etc.*/

import java.util.Scanner;

// User Defined Exception
class BookException extends Exception
{
    BookException(String msg)
    {
        super(msg);
    }
}

// Book Class
class Book
{
    int id;
    String name;
    boolean available = true;

    // Add Book
    void addBook(int i, String n)
    {
        id = i;
        name = n;

        System.out.println("Book Added Successfully");
    }

    // Issue Book
    void issueBook() throws BookException
    {
        if(available)
        {
            available = false;
            System.out.println("Book Issued Successfully");
        }

        else
        {
            throw new BookException("Book Already Issued");
        }
    }

    // Return Book
    void returnBook() throws BookException
    {
        if(!available)
        {
            available = true;
            System.out.println("Book Returned Successfully");
        }

        else
        {
            throw new BookException("Book Already Available");
        }
    }

    // Display Book
    void displayBook()
    {
        System.out.println("\nBook ID : " + id);
        System.out.println("Book Name : " + name);

        if(available)
        {
            System.out.println("Status : Available");
        }

        else
        {
            System.out.println("Status : Issued");
        }
    }
}

// Main Class
public class LibraryManagement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        int choice;

        do
        {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            try
            {
                switch(choice)
                {
                    case 1:

                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String name = sc.nextLine();

                        b.addBook(id, name);
                        break;

                    case 2:

                        b.issueBook();
                        break;

                    case 3:

                        b.returnBook();
                        break;

                    case 4:

                        b.displayBook();
                        break;

                    case 5:

                        System.out.println("Program Ended");
                        break;

                    default:

                        System.out.println("Invalid Choice");
                }
            }

            catch(BookException e)
            {
                System.out.println(e.getMessage());
            }

        } while(choice != 5);

        sc.close();
    }
}

