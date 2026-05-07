package Slip1_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteEmployee {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);

        try {
            FileWriter var2 = new FileWriter("employee.txt", true);
            System.out.print("Enter Employee ID: ");
            int var3 = var1.nextInt();
            var1.nextLine();
            System.out.print("Enter Employee Name: ");
            String var4 = var1.nextLine();
            System.out.print("Enter Employee Salary: ");
            double var5 = var1.nextDouble();
            var2.write("ID: " + var3 + "\n");
            var2.write("Name: " + var4 + "\n");
            var2.write("Salary: " + var5 + "\n");
            var2.write("----------------------\n");
            var2.close();
            System.out.println("Employee data written successfully.");
        } catch (IOException var7) {
            System.out.println("Error: " + var7);
        }

        var1.close();
    }
}

