
import java.io.*;
import java.net.*;
public class server {
public static void main(String[] args) {
try {
// Create server socket
ServerSocket serverSocket = new ServerSocket(5000);
System.out.println("Server is waiting for client...");
// Accept client connection
Socket socket = serverSocket.accept();
System.out.println("Client connected");
// Input and Output streams
BufferedReader in = new BufferedReader(
new InputStreamReader(socket.getInputStream()));
PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
// Read message from client
String message = in.readLine();
System.out.println("Message from client: " + message);
// Echo message back to client
out.println(message);
// Close connections
socket.close();
serverSocket.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
