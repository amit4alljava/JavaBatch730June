import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step -1 Create FileOutputStream And Specify the Path 
		// where u want to write the file
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/testing/test.txt");
		// Step -2 Specify the Data to Write
		String data= "hello this is sample data to store in a file";
		// Step - 3 Convert Data into Bytes then write in a file
		//fo.write(data.getBytes());  // write () store bytes in a file
		fo.write("hello this is sample data to store in a file".getBytes());
		// Step - 4 Close the File
		fo.close();
		System.out.println("Data Store in a File...");
	}

}
