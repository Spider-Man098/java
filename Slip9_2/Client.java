package Slip9_2;
package Slip9_2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client
{
    public static void main(String args[]) throws Exception
    {
        Socket s = new Socket("localhost", 5000);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Message : ");
        String msg = sc.nextLine();

        DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

        dos.writeUTF(msg);

        DataInputStream dis =
                new DataInputStream(s.getInputStream());

        String serverMsg = dis.readUTF();

        System.out.println("Server Reply : " + serverMsg);

        s.close();
    }
}

