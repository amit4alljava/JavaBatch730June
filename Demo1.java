import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress.getHostName());
		System.out.println(inetAddress.getHostAddress());
		System.out.println("Enter the host name");
		Scanner scanner = new Scanner(System.in);
		String hostName = scanner.next();
		InetAddress inet[] = InetAddress.getAllByName(hostName);
		for(InetAddress i : inet){
			System.out.println(i.getHostName()+" "+i.getHostAddress());
		}
		scanner.close();
				
	}

}
