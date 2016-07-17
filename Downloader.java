import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Downloader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String downloadPath = "/Users/amit/Documents/FileHandlingTesting/download"; 
		System.out.println("Enter the URL");
		Scanner scanner = new Scanner(System.in);
		String urlStr = scanner.next();
		URL url  = new URL(urlStr);
		
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		String fileName = urlStr.substring(urlStr.lastIndexOf("/"));
		System.out.println("File Name is "+fileName);
		FileOutputStream fo = new FileOutputStream(downloadPath+fileName);
		BufferedOutputStream bs = new BufferedOutputStream(fo);
		BufferedInputStream bi = new BufferedInputStream(is);
		int singleByte = bi.read();
		while(singleByte!=-1){
			bs.write(singleByte);
			singleByte = bi.read();
		}
		System.out.println("File Downloaded");
		bs.close();
		bi.close();
		is.close();
		fo.close();
		
	}

}
