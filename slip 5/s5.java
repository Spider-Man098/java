
import java.io.*;
import java.util.*;

public class s5 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int ch;

        do {

            System.out.println("\n1.Add  2.Display  3.Search  4.Exit");
            System.out.print("Enter Choice: ");

            ch = sc.nextInt();

            try {

                switch(ch) {

                    case 1:

                        FileWriter fw = new FileWriter("student.txt", true);

                        System.out.print("Enter Roll No: ");
                        int r = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String n = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double m = sc.nextDouble();

                        fw.write(r + " " + n + " " + m + "\n");

                        fw.close();

                        System.out.println("Record Added");

                        break;

                    case 2:

                        Scanner f1 = new Scanner(new File("student.txt"));

                        System.out.println("\nStudent Records:");

                        while(f1.hasNextLine())
                            System.out.println(f1.nextLine());

                        f1.close();

                        break;

                    case 3:

                        Scanner f2 = new Scanner(new File("student.txt"));

                        System.out.print("Enter Roll No to Search: ");

                        int s = sc.nextInt();

                        boolean found = false;

                        while(f2.hasNextLine()) {

                            String data = f2.nextLine();

                            if(data.startsWith(s + " ")) {

                                System.out.println("Student Found:");
                                System.out.println(data);

                                found = true;
                            }
                        }

                        if(!found)
                            System.out.println("Student Not Found");

                        f2.close();

                        break;

                    case 4:

                        System.out.println("Program Ended");

                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } catch(Exception e) {

                System.out.println(e);
            }

        } while(ch != 4);
    }
}


