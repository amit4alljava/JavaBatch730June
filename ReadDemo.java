import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step -1 Open a File
		final int EOF  = -1; // EOF (End of File)
		FileInputStream fi = 
				new FileInputStream("/Users/amit/Documents/testing/TumHiHo.mp3");
		BufferedInputStream bi = new BufferedInputStream(fi);
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/testing/Copy.mp3");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		// Step - 2 Read a File
		long startTime = System.currentTimeMillis();
		//int singleByte = fi.read(); // Read Single Byte
		int singleByte = bi.read();
		// Loop till reach to EOF
		while(singleByte!=EOF){
			bo.write(singleByte);
			//fo.write(singleByte);
			//System.out.print((char)singleByte);  // Print the Value
			//singleByte = fi.read(); // Read Again the Another Byte
			singleByte = bi.read();
		}
		// Step - 3 Close the File
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		bi.close();
		bo.close();
		fi.close();
		fo.close();
		System.out.println("Done...");
	}

}
