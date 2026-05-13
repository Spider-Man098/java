
import java.util.Scanner;
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {

        super(message);
    }
}

public class s4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rollNo;
        int marks;

        try {

            // Accept input from user
            System.out.print("Enter Roll Number: ");
            rollNo = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks = sc.nextInt();

            if (marks > 100) {

                throw new InvalidMarksException(
                        "Marks cannot be greater than 100.");
            }

            System.out.println("\nStudent Details");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Marks: " + marks);

        } catch (InvalidMarksException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
