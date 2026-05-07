package Slip1_2;

import java.sql.*;
import java.util.Scanner;

public class StudentRecord {

    // Database URL, Username, Password
    static final String URL = "jdbc:mysql://localhost:3306/slips";
    static final String USER = "root";
    static final String PASSWORD = "Shubham.k";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Load JDBC Driver
           // Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Transaction Management
            con.setAutoCommit(false);

            int choice;

            do {
                System.out.println("\n===== STUDENT CRUD OPERATIONS =====");
                System.out.println("1. Insert Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // INSERT
                    case 1:

                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        String insertQuery =
                                "INSERT INTO slip1_2 (id,name,course) VALUES(?,?,?)";

                        PreparedStatement ps1 =
                                con.prepareStatement(insertQuery);

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, course);

                        ps1.executeUpdate();

                        con.commit();

                        System.out.println("Student Inserted Successfully.");
                        break;

                    // READ
                    case 2:

                        String selectQuery = "SELECT * FROM slip1_2";

                        PreparedStatement ps2 =
                                con.prepareStatement(selectQuery);

                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\n--- Student Records ---");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("id") + "  " +
                                            rs.getString("name") + "  " +
                                            rs.getString("course")
                            );
                        }

                        break;

                    // UPDATE
                    case 3:

                        System.out.print("Enter Student ID to Update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        String updateQuery =
                                "UPDATE slip1_2 SET name=? WHERE id=?";

                        PreparedStatement ps3 =
                                con.prepareStatement(updateQuery);

                        ps3.setString(1, newName);
                        ps3.setInt(2, updateId);

                        ps3.executeUpdate();

                        con.commit();

                        System.out.println("Student Updated Successfully.");
                        break;

                    // DELETE
                    case 4:

                        System.out.print("Enter Student ID to Delete: ");
                        int deleteId = sc.nextInt();

                        String deleteQuery =
                                "DELETE FROM slip1_2 WHERE id=?";

                        PreparedStatement ps4 =
                                con.prepareStatement(deleteQuery);

                        ps4.setInt(1, deleteId);

                        ps4.executeUpdate();

                        con.commit();

                        System.out.println("Student Deleted Successfully.");
                        break;

                    case 5:
                        System.out.println("Program Ended.");
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
