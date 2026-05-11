package Slip16_2;
/* Write a program to implement patient information in a file and perform the file
operations on it. */

import java.io.*;
import java.util.*;

public class PatientFile
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("\n===== PATIENT MENU =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Delete Patient");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                // Add Patient
                case 1:

                    FileWriter fw =
                            new FileWriter("patient.txt", true);

                    sc.nextLine();

                    System.out.print("Enter Patient ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    fw.write(id + "," + name + "," +
                             disease + "\n");

                    fw.close();

                    System.out.println("Patient Added Successfully");
                    break;

                // View Patients
                case 2:

                    BufferedReader br =
                            new BufferedReader(
                                    new FileReader("patient.txt"));

                    String line;

                    System.out.println("\n===== PATIENT RECORDS =====");

                    while((line = br.readLine()) != null)
                    {
                        String data[] = line.split(",");

                        System.out.println(
                                "ID : " + data[0] +
                                "  Name : " + data[1] +
                                "  Disease : " + data[2]);
                    }

                    br.close();
                    break;

                // Delete Patient
                case 3:

                    sc.nextLine();

                    System.out.print(
                            "Enter Patient ID to Delete: ");

                    String deleteId =
                            sc.nextLine();

                    File inputFile =
                            new File("patient.txt");

                    File tempFile =
                            new File("temp.txt");

                    BufferedReader reader =
                            new BufferedReader(
                                    new FileReader(inputFile));

                    BufferedWriter writer =
                            new BufferedWriter(
                                    new FileWriter(tempFile));

                    String currentLine;

                    while((currentLine =
                           reader.readLine()) != null)
                    {
                        String data[] =
                                currentLine.split(",");

                        if(!data[0].equals(deleteId))
                        {
                            writer.write(
                                    currentLine + "\n");
                        }
                    }

                    reader.close();
                    writer.close();

                    inputFile.delete();

                    tempFile.renameTo(inputFile);

                    System.out.println(
                            "Patient Deleted Successfully");

                    break;

                case 4:

                    System.out.println("Program Ended");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }}
