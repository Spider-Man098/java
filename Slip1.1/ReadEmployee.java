package Slip1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEmployee {
    public static void main(String[] args) {

        try {
            File file = new File("employee.txt");
            Scanner sc = new Scanner(file);

            System.out.println("Employee Details:\n");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
