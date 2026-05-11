package Slip9_2;

/* Write a client-server program using TCP sockets to echo the message sent by the
client */


import java.io.*;
import java.net.*;

public class Server
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server Waiting...");

        Socket s = ss.accept();

        DataInputStream dis =
                new DataInputStream(s.getInputStream());

        String msg = dis.readUTF();

        System.out.println("Client Message : " + msg);

        DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

        dos.writeUTF("Echo : " + msg);

        ss.close();
    }
}