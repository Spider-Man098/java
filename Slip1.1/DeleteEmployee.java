package Slip1_1;


import java.io.*;

public class DeleteEmployee
{
    public static void main(String[] args)
    {
        File myFile = new File("employee.txt");

        if(myFile.delete())
        {
            System.out.println("Employee Record Deleted : " + myFile.getName());
        }

        else
        {
            System.out.println("Employee Record not deleted !");
        }
    }
}
