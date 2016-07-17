import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int PORT = 9001;
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Server Start and Waiting for the Client");
		Socket socket = server.accept();
		System.out.println("Here Comes the Client....");
		System.out.println("Enter the Message Send to the Client");
		String msg = new Scanner(System.in).nextLine();
		OutputStream os = socket.getOutputStream();
		os.write(msg.getBytes());
		System.out.println("Message Send to the Client....");
		os.close();
		socket.close();

	}

}
