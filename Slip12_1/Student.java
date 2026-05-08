package Slip12_1;

/* Write a program to accept roll no. Marks from users. Throw user defined exception
Marks out of Bound if marks are 100. */

import java.util.Scanner;

// User Defined Exception
class MarksOutOfBoundException extends Exception
{
    MarksOutOfBoundException(String msg)
    {
        super(msg);
    }
}

public class  Student   
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            if(marks > 100)
            {
                throw new MarksOutOfBoundException(
                        "Marks Out Of Bound");
            }

            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);
        }

        catch(MarksOutOfBoundException e)
        {
            System.out.println(e);
        }

        sc.close();
    }
} {
    
}
