import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		final String SERVER_IP = "localhost";
		final int SERVER_PORT= 9001;
		Socket socket = new Socket(SERVER_IP,SERVER_PORT);
		System.out.println("Client Join....");
		InputStream is = socket.getInputStream();
		int singleChar = is.read();
		System.out.println("Server Message is ");
		while(singleChar!=-1){
			System.out.print((char)singleChar);
			singleChar = is.read();
		}
		is.close();
		socket.close();
	}

}
