
/*Create a Java application that connects to a MySQL database to manage employee
        information. Implement functionalities like adding, updating, deleting, and viewing
        employee records using JDBC. Use prepared statements to prevent SQL injection
        and handle exceptions gracefully.*/

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD
{
    static final String URL ="jdbc:mysql://localhost:3306/slips";
    static final String USER = "root";
    static final String PASSWORD = "Shubham.k";

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            // Load Driver
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con =DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;

            do
            {
                System.out.println("\n===== EMPLOYEE MENU =====");
                System.out.println("1. Add Employee");
                System.out.println("2. Update Employee");
                System.out.println("3. Delete Employee");
                System.out.println("4. View Employees");
                System.out.println("5. Exit");

                System.out.print("Enter Choice: ");
                choice = sc.nextInt();

                switch(choice)
                {
                    // Add Employee
                    case 1:

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        String insertQuery = "INSERT INTO slip19_2 VALUES(?,?,?)";
                        PreparedStatement ps1 =con.prepareStatement(insertQuery);

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setDouble(3, salary);

                        ps1.executeUpdate();

                        System.out.println("Employee Added Successfully");
                        break;

                    // Update Employee
                    case 2:

                        System.out.print("Enter Employee ID: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        String updateQuery = "UPDATE slip19_2 SET name=? WHERE id=?";
                        PreparedStatement ps2 =con.prepareStatement(updateQuery);

                        ps2.setString(1, newName);
                        ps2.setInt(2, updateId);

                        ps2.executeUpdate();

                        System.out.println("Employee Updated Successfully");
                        break;

                    // Delete Employee
                    case 3:

                        System.out.print("Enter Employee ID: ");
                        int deleteId = sc.nextInt();

                        String deleteQuery = "DELETE FROM slip19_2 WHERE id=?";

                        PreparedStatement ps3 =con.prepareStatement(deleteQuery);

                        ps3.setInt(1, deleteId);

                        ps3.executeUpdate();

                        System.out.println("Employee Deleted Successfully");
                        break;

                    // View Employees
                    case 4:

                        String selectQuery =
                                "SELECT * FROM slip19_2";

                        PreparedStatement ps4 = con.prepareStatement(selectQuery);

                        ResultSet rs = ps4.executeQuery();

                        System.out.println("\n===== EMPLOYEE RECORDS =====");

                        while(rs.next())
                        {
                            System.out.println(
                                    rs.getInt("id") + "  " +
                                            rs.getString("name") + "  " +
                                            rs.getDouble("salary"));
                        }

                        break;

                    case 5:

                        System.out.println("Program Ended");
                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } while(choice != 5);

            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        sc.close();
    }
}

