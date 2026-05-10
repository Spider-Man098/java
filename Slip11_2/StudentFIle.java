package Slip11_2;
/* 
Write a program to implement student information in a file and perform the file
operations on it. */

import java.io.*;
import java.util.*;

public class StudentFile
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Delete by Roll No");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    FileWriter fw =
                            new FileWriter("student.txt", true);

                    sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    String roll = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    fw.write(roll + "," + name + "," +
                            course + "\n");

                    fw.close();

                    System.out.println("Student Added");
                    break;

                case 2:
                    BufferedReader br =
                            new BufferedReader(
                                    new FileReader("student.txt"));

                    String line;

                    System.out.println("\nStudent Records:");

                    while((line = br.readLine()) != null)
                    {
                        System.out.println(line);
                    }

                    br.close();
                    break;

                case 3:
                    sc.nextLine();

                    System.out.print(
                            "Enter Roll No to Delete: ");

                    String deleteRoll =
                            sc.nextLine();

                    File input =
                            new File("student.txt");

                    File temp =
                            new File("temp.txt");

                    BufferedReader reader =
                            new BufferedReader(
                                    new FileReader(input));

                    BufferedWriter writer =
                            new BufferedWriter(
                                    new FileWriter(temp));

                    String currentLine;

                    while((currentLine =
                            reader.readLine()) != null)
                    {
                        String data[] =
                                currentLine.split(",");

                        if(!data[0].equals(deleteRoll))
                        {
                            writer.write(
                                    currentLine + "\n");
                        }
                    }

                    reader.close();
                    writer.close();

                    input.delete();
                    temp.renameTo(input);

                    System.out.println(
                            "Student Deleted");
                    break;

                case 4:
                    System.out.println(
                            "Program Ended");
                    break;

                default:
                    System.out.println(
                            "Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}
